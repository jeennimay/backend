package br.com.dh.odontologia.dao.configuracao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConfiguracaoJDBC {

    private String jdbcDriver;
    private String dbUrl;
    private String nomeUsusario;
    private String senhaUsuario;

    public ConfiguracaoJDBC(String jdbcDriver, String dbUrl, String nomeUsusario, String senhaUsuario) {
        this.jdbcDriver = jdbcDriver;
        this.dbUrl = dbUrl;
        this.nomeUsusario = nomeUsusario;
        this.senhaUsuario = senhaUsuario;
    }

    //Construtor configurado
    public ConfiguracaoJDBC(){
        this.jdbcDriver = "org.h2.Driver";
        this.dbUrl = "jdbc:h2:~/clinica;DB_CLOSE_DELAY=-1;INIT=RUNSCRIPT FROM 'CREATE.SQL'";
        this.nomeUsusario = "sa";
        this.senhaUsuario = "";
    }

    //Método para conectar no BD
    public Connection conectarComBD(){
        Connection connection = null;

        try{
            connection = DriverManager.getConnection(dbUrl,nomeUsusario, senhaUsuario);
        }
        catch (SQLException e){
            e.printStackTrace();
        }

        return connection;
    }

}
