import java.sql.*;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Usuarios {
    private static final String sqlCreateTable = "DROP TABLE IF EXISTS usuarios;" + "CREATE TABLE usuarios(id INT AUTO_INCREMENT PRIMARY KEY, primeiro_nome VARCHAR(32) NOT NULL, sobrenome VARCHAR(32) NOT NULL, idade INT NOT NULL, altura DOUBLE NOT NULL, peso DOUBLE NOT NULL, matriculado boolean NOT NULL);";

    private static String sqlInsert = "INSERT INTO usuarios (primeiro_nome, sobrenome, idade, altura, peso, matriculado) VALUES ('Jardel', 'Silva', '24', 1.78, 80.1, true), ('Rener', 'Almeida', '31', 1.69, 87.5, false), ('Caio', 'Castro', '22', 1.90, 74.6, true);";

    private static String sqlDelete = "DELETE FROM usuarios WHERE id = 2;";

    //Declaração do nossos Logger
    private static final Logger logger = Logger.getLogger(Usuarios.class);


    public static void main(String[] args) throws Exception {

        //configuração do Logging
        BasicConfigurator.configure();

        Connection connection = null;

        try{
            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(sqlCreateTable);
            statement.execute(sqlInsert);

            statement.execute(sqlDelete);

            logger.info("Excluimos o usuario com o id 2");

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if (connection == null)
                return;
            try {
                connection.close();
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver");

        return DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");

    }


}
