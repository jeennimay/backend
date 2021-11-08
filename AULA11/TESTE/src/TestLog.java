import java.sql.*;

public class TestLog {

    public static void main(String[] args) throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        Connection con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
        Statement stmt = con.createStatement();

        String insertSql = "INSERT INTO TEST VALUES(1, 'Hello');\n" +
                "INSERT INTO TEST VALUES(2, 'World');\n";
        stmt.execute(insertSql);

        String sql = "SELECT * FROM TEST";

        ResultSet rd = stmt.executeQuery(sql);
        while (rd.next()) {
            System.out.println(rd.getInt(1) + rd.getString(2));
        }
    }
}
