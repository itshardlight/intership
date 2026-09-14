import java.sql.Connection;

public class LibraryManagement {
    public static void main(String[] args) {
        Connection con = DatabaseConnection.getConnection();

        if (con != null) {
            System.out.println("Main: Connection received!");
        }
        // @EJB
        // private User user;

        User user = new User();

        user.createUser();

    }
}