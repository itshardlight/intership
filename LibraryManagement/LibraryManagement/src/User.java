
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

import com.mysql.cj.protocol.Resultset;

public class User {

    UsersEntity entity = new UsersEntity();

    public String inputUser() {
        String nameInput = new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name!");
        return nameInput = sc.nextLine();
    }

    public UsersEntity checkUser(String userName) {
        String sql = "SELECT name FROM users WHERE name = ?";
        try {
            Connection connection = DatabaseConnection.getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, userName);
            ResultSet rs = ps.executeQuery();
            UsersEntity user = new UsersEntity();
            if (rs.next()) {
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
            }
            return user;

        } catch (Exception e) {
            System.out.println("User Already Exist");
        }
        return null;

    }

    public void saveUser(String userName) {
        String sql = "INSERT INTO users (name) VALUES (?)";
        entity = checkUser(userName);
        if (entity != null) {
            try {
                Connection connection = DatabaseConnection.getConnection();
                PreparedStatement ps = connection.prepareStatement(sql);
                ps.setString(1, userName);
                ps.executeUpdate();
                System.out.println("User Registerd Sucessfully");
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }

    public void createUser() {
        saveUser(inputUser());
    }

}
