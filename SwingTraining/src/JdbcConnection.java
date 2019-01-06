import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnection {

    Connection conn;

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        JdbcConnection jdbcConnection=new JdbcConnection();
        jdbcConnection.createDbUserTable();

    }

    public JdbcConnection() throws SQLException, ClassNotFoundException {
       // Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Jdbc?useUnicode=true&useJBDCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root", "12345");

    }
    private void createDbUserTable() throws SQLException {
        Connection dbConnection = conn;
        Statement statement = null;

        String createTableSQL = "CREATE TABLE `jdbc`.`user` (\n" +
                "  `idUser` INT NOT NULL AUTO_INCREMENT COMMENT '',\n" +
                "  `nameUser` VARCHAR(45) NULL COMMENT '',\n" +
                "  `ageUser` INT NULL COMMENT '',\n" +
                "  PRIMARY KEY (`idUser`)  COMMENT '');\n";

      //  String addUserSQL="insert into 'jdbc'.'user'('idUser','nameUser','ageUser') values ('1','Pety','25');";
       String addUserSQL="INSERT INTO `jdbc`.`user` (`idUser`, `nameUser`, `ageUser`) VALUES ('1', 'Pety', '25');";


        try {

            statement = dbConnection.createStatement();

            // выполнить SQL запрос
//            statement.execute(createTableSQL);
            statement.executeUpdate(addUserSQL);
            System.out.println("Table \"dbuser\" is created!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if (statement != null) {
                statement.close();
            }
            if (dbConnection != null) {
                dbConnection.close();
            }
        }
        conn.close();
    }

}
