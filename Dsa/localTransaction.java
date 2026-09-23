import java.sql.Connection;
import java.sql.PreparedStatement;

public class localTransaction {

    public static void main(String[] args) {

        Connection con = DatabaseConnection.getConnection();

        try {
            con.setAutoCommit(false);

            String sql = "INSERT INTO users (name) VALUES (?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, "Ram");
            ps.executeUpdate();

            con.commit();

            System.out.println("Transaction committed!");

        } catch (Exception e) {

            try {
                con.rollback();

                System.out.println("Transaction rolled back!");

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}