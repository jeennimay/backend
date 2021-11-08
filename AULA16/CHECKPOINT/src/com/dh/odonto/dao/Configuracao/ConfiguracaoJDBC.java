package com.dh.odonto.dao.Configuracao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConfiguracaoJDBC {

    private String jdbcDriver;
    private String dbUrl;
    private String nomeusuario;
    private String senhausuario;

    public ConfiguracaoJDBC(String jdbcDriver, String dbUrl, String nomeusuario, String senhausuario) {
        this.jdbcDriver = jdbcDriver;
        this.dbUrl = dbUrl;
        this.nomeusuario = nomeusuario;
        this.senhausuario = senhausuario;
    }

    //recebendo os parametros
    public ConfiguracaoJDBC() {
        this.jdbcDriver = "org.h2.Driver";
        this.dbUrl = "jdbc:h2:~/clinica;DB_CLOSE_DELAY=-1;INIT=RUNSCRIPT FROM './src/CREATE.SQL'";
        this.nomeusuario = "sa";
        this.senhausuario = "";
    }

    public Connection conectarComBD(){
        Connection connection = null;

        try{
            connection = DriverManager.getConnection(dbUrl, nomeusuario, senhausuario);
        }
        catch (SQLException e){
            e.printStackTrace();
        }

        return connection;
    }
}
