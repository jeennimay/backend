package br.com.dh.odontologia.dao.impl;

import br.com.dh.odontologia.dao.IDao;
import br.com.dh.odontologia.dao.configuracao.ConfiguracaoJDBC;
import br.com.dh.odontologia.model.Endereco;
import br.com.dh.odontologia.model.Paciente;
import br.com.dh.odontologia.util.Util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class PacienteDaoH2 implements IDao<Paciente> {

    private ConfiguracaoJDBC configuracaoJDBC;
    private EnderecoDaoH2 enderecoDaoH2;

    public PacienteDaoH2(EnderecoDaoH2 enderecoDaoH2) {
        this.configuracaoJDBC = new ConfiguracaoJDBC();
        this.enderecoDaoH2 = enderecoDaoH2;
    }

    @Override
    public Paciente salvar(Paciente paciente) {
        Connection conexao = configuracaoJDBC.conectarComBD();
        Statement stmt = null;
        paciente.setEndereco(enderecoDaoH2.salvar(paciente.getEndereco()));

        String query = String.format(
                "INSERT INTO paciente (nome, sobrenome, rg, dataCadastro, endereco_id) VALUES('%s', '%s', '%s', '%s', '%s')",
                paciente.getNome(),
                paciente.getSobrenome(),
                paciente.getRg(),
                Util.dateToTimestamp(paciente.getDataCadastro()),
                paciente.getEndereco().getId()
        );

        try {
            stmt = conexao.createStatement();
            stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = stmt.getGeneratedKeys();

            if (keys.next())
                paciente.setId(keys.getInt(1));
            stmt.close();
        }
        catch (SQLException e){
            e.printStackTrace();
        }

        return paciente;
    }

    //método buscar

    @Override
    public Optional<Paciente> buscar(Integer id) {
        Connection conexao = configuracaoJDBC.conectarComBD();
        Statement stmt = null;
        String query = String.format("SELECT id, sobrenome, rg, data_cadastro, endereco_id FROM paciente WHERE id = '%s'", id);
        Paciente paciente = null;

        try {
            stmt = conexao.createStatement();
            ResultSet resultado = stmt.executeQuery(query);

            while (resultado.next()) {
                paciente = criarObjetoPaciente(resultado);
            }
            stmt.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        return paciente != null ? Optional.of(paciente) : Optional.empty();
    }

    //método excluir

    @Override
    public void excluir(Integer id) {
        Connection conexao = configuracaoJDBC.conectarComBD();
        Statement stmt = null;
        String query = String.format("DELETE FROM paciente WHERE id = '%s'", id);

        try {
            stmt = conexao.createStatement();
            stmt.executeUpdate(query);
            stmt.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

    }

    //método buscarTodos

    @Override
    public List<Paciente> buscarTodos() {
        //log.debug("Buscando...");
        Connection conexao = configuracaoJDBC.conectarComBD();
        Statement stmt = null;
        String query = "SELECT * FROM paciente";
        List<Paciente> pacientes = new ArrayList<>();

        try {
            stmt = conexao.createStatement();
            ResultSet resultado = stmt.executeQuery(query);

            while (resultado.next()) {
                pacientes.add(criarObjetoPaciente(resultado));
            }

            stmt.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        return pacientes;
    }

    private Paciente criarObjetoPaciente(ResultSet resultado) throws SQLException {
        Integer idP = resultado.getInt("id");
        String nome = resultado.getString("nome");
        String sobrenome = resultado.getString("sobrenome");
        String rg = resultado.getString("rg");
        Date dataCadastro = resultado.getDate("data_cadastro");
        Endereco endereco = enderecoDaoH2.buscar(resultado.getInt("endereco_id")).orElse(null);

        return new Paciente(idP, nome, sobrenome, rg, dataCadastro, endereco);
    }

}
