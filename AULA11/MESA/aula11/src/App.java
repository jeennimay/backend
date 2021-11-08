import java.sql.*;

public class App {

    private static final String sqlCreateTable = "DROP TABLE IF EXISTS figuras;" + "CREATE TABLE figuras(id INT AUTO_INCREMENT PRIMARY KEY, figura VARCHAR(16), cor VARCHAR(16));";

    private static String sqlInsertCirculo = "INSERT INTO figuras (figura, cor) VALUES ('Circulo', 'vermelho'), ('Circulo', 'azul'), ('Circulo', 'amarelo');";

    private static String sqlInsertQuadrado = "INSERT INTO figuras (figura, cor) VALUES ('Quadrado', 'vermelho'), ('Quadrado', 'azul'), ('Quadrado', 'amarelo');";


    public static void main(String[] args) throws Exception {

        Class.forName("org.h2.Driver");
        Connection connection = null;

        try{
            connection = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
            Statement statement = connection.createStatement();
            statement.execute(sqlCreateTable);
            statement.execute(sqlInsertCirculo);
            statement.execute(sqlInsertQuadrado);

            ShowFiguras(connection);

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

    private static void ShowFiguras(Connection connection) throws SQLException{
        String sqlQuery = "SELECT * FROM figuras WHERE figura = 'Circulo' AND cor = 'vermelho';";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        while (rs.next()) {
            System.out.println("Figura " + rs.getInt(1) + ": " + rs.getString(2)
                    +" "+ rs.getString(3));
        }
    }

}
