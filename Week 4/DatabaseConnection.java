import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    public static Connection getConnection() {

        String url = "jdbc:mysql://localhost:3306/testdb";
        String username = "root";
        String password = "pasword";

        try {
            Connection con = DriverManager.getConnection(url, username, password);

            System.out.println("Database connected!");

            return con;

        } catch (Exception e) {
            System.out.println("Database connection failed!");
            e.printStackTrace();
            return null;
        }
    }
}