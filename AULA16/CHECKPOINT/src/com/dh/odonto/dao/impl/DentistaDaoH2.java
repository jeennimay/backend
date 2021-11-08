package com.dh.odonto.dao.impl;

import com.dh.odonto.dao.Configuracao.ConfiguracaoJDBC;
import com.dh.odonto.dao.IDao;
import com.dh.odonto.model.Dentista;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DentistaDaoH2 implements IDao<Dentista> {

    private ConfiguracaoJDBC configuracaoJDBC;

    public DentistaDaoH2() {
        this.configuracaoJDBC = new ConfiguracaoJDBC();
    }

    //Método salvar
    @Override
    public Dentista salvar(Dentista dentista) {
        Connection connection = configuracaoJDBC.conectarComBD();
        Statement statement = null;
        String query = String.format("INSERT INTO dentista (nome, sobrenome, numMatricula)" +
                "VALUES ('%s', '%s', '%s')", dentista.getNome(), dentista.getSobrenome(), dentista.getNumMatricula());

        try {
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = statement.getGeneratedKeys();

            if (keys.next())
                dentista.setId(keys.getInt(1));
            statement.close();
            connection.close();
        }
        catch (SQLException e){
            e.printStackTrace();
        }

        return dentista;
    }

    //Método buscar
    @Override
    public Optional<Dentista> buscar(Integer id) {
        Connection connection = configuracaoJDBC.conectarComBD();
        Statement statement = null;
        String query = String.format("SELECT id, nome, sobrenome, numMatricula FROM dentista WHERE id = '%s'", id);
        Dentista dentista = null;

        try {
            statement = connection.createStatement();
            ResultSet result = statement.executeQuery(query);

            while (result.next()){
                dentista = criarObjetoDentista(result);
            }
            statement.close();
            connection.close();
        }
        catch (SQLException e){
            e.printStackTrace();
        }


        return dentista != null ? Optional.of(dentista) : Optional.empty();
    }

    //Método Excluir
    @Override
    public void excluir(Integer id) {
        Connection connection = configuracaoJDBC.conectarComBD();
        Statement statement = null;
        String query = String.format("DELETE FROM endereco WHERE id = '%s'", id);

        try {
            statement = connection.createStatement();
            statement.executeUpdate(query);
            statement.close();
        }
        catch (SQLException e){
            e.printStackTrace();
        }

    }

    //Método BuscarTodos
    @Override
    public List<Dentista> buscarTodos() {
        Connection connection = configuracaoJDBC.conectarComBD();
        Statement statement = null;
        String query = "SELECT * FROM dentista";
        List<Dentista> dentistas = new ArrayList<>();

        try {
            statement = connection.createStatement();
            ResultSet result = statement.executeQuery(query);

            while (result.next()){
                dentistas.add(criarObjetoDentista(result));
            }
            statement.close();
        }
        catch (SQLException e){
            e.printStackTrace();
        }

        return dentistas;
    }

    //Método criarObjetoDentista
    private Dentista criarObjetoDentista(ResultSet resultado) throws SQLException{
        Integer id = resultado.getInt("id");
        String nome = resultado.getString("rua");
        String sobrenome = resultado.getString("sobrenome");
        String numMatricula = resultado.getString("numMatricula");

        return new Dentista(id, nome, sobrenome, numMatricula);
    }
}
