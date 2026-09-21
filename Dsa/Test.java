import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        sourceCode();

    }

    public static void sourceCode() {
        List<User> data = userData();

        for (User user : data) {
            System.out.println(user.getId());
            System.out.println(user.getName());
            System.out.println(user.getParentId());
        }
    }

    public static List<User> userData() {
        User user = new User();

        List<User> data = new ArrayList<>();

        String sql = "SELECT id, name, parent_id FROM users";

        try {
            Connection con = DatabaseConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                int id = rs.getInt("id");
                String name = rs.getString("name");

                int parentIdValue = rs.getInt("parent_id");

                Integer parentId = rs.wasNull()
                        ? null
                        : parentIdValue;

                data.add(new User(id, name, parentId));
            }

            user.setData(data);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return data;
    }
}