package com.dh.odonto.dao.impl;

import com.dh.odonto.dao.Configuracao.ConfiguracaoJDBC;
import com.dh.odonto.dao.IDao;
import com.dh.odonto.model.Endereco;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EnderecoDaoH2 implements IDao<Endereco> {

    private ConfiguracaoJDBC configuracaoJDBC;

    public EnderecoDaoH2(){
        this.configuracaoJDBC = new ConfiguracaoJDBC();

    }

    //Método salvar
    @Override
    public Endereco salvar (Endereco endereco){
        Connection conexao = configuracaoJDBC.conectarComBD();
        Statement stmt = null;
        String query = String.format("INSERT INTO endereco (rua,  numero, bairro, cidade) VALUES('%s', '%s', '%s', '%s')",
                endereco.getRua(),
                endereco.getNumero(),
                endereco.getBairro(),
                endereco.getCidade());

        try {
            stmt = conexao.createStatement();
            stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = stmt.getGeneratedKeys();
            if (keys.next())
                endereco.setId(keys.getInt(1));
            stmt.close();
            conexao.close();
        }
        catch (SQLException e){
            e.printStackTrace();
        }

        return endereco;
    }

    //método buscar

    @Override
    public Optional<Endereco> buscar(Integer id) {

        Connection conexao = configuracaoJDBC.conectarComBD();
        Statement stmt = null;
        String query = String.format("SELECT id, rua, numero, cidade, bairro FROM endereco WHERE id = '%s'", id);
        Endereco endereco = null;

        try{
            stmt = conexao.createStatement();
            ResultSet resultado = stmt.executeQuery(query);

            while (resultado.next()){
                endereco = criarObjetoEndereco(resultado);
            }
            stmt.close();
            conexao.close();

        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        return endereco != null ? Optional.of(endereco) : Optional.empty();
    }

    //método excluir

    @Override
    public void excluir(Integer id) {
        Connection conexao = configuracaoJDBC.conectarComBD();
        Statement stmt = null;
        String query = String.format("DELETE FROM endereco WHERE id = '%s'", id);

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
    public List<Endereco> buscarTodos() {
        Connection conexao = configuracaoJDBC.conectarComBD();
        Statement stmt = null;
        String query = "SELECT * FROM endereco";
        List<Endereco> enderecos = new ArrayList<>();

        try {
            stmt = conexao.createStatement();
            ResultSet result = stmt.executeQuery(query);

            while (result.next()) {
                enderecos.add(criarObjetoEndereco(result));
            }
            stmt.close();
        }
        catch (SQLException e){
            e.printStackTrace();
        }

        return enderecos;
    }

    private Endereco criarObjetoEndereco(ResultSet resultado) throws SQLException {
        Integer id = resultado.getInt("id");
        String rua = resultado.getString("rua");
        String numero = resultado.getString("numero");
        String bairro = resultado.getString("bairro");
        String cidade = resultado.getString("cidade");

        return new Endereco(id, rua, numero, bairro, cidade);
    }
}
