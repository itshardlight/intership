import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test {

    List<Integer> Gen1;
    List<Integer> Gen2;
    List<Integer> Gen3;
    Map<Integer, List<Integer>> parentChild = new HashMap<>();

    Map<Integer, Map<Integer, List<Integer>>> childGrandChild = new HashMap<>();

    // getter and setter
    public List<Integer> getGen1() {
        return Gen1;
    }

    public void setGen1(List<Integer> Gen1) {
        this.Gen1 = Gen1;
    }

    public List<Integer> getGen2() {
        return Gen2;
    }

    public void setGen2(List<Integer> Gen2) {
        this.Gen2 = Gen2;
    }

    public List<Integer> getGen3() {
        return Gen3;
    }

    public void setGen3(List<Integer> Gen3) {
        this.Gen3 = Gen3;
    }

    public Map<Integer, List<Integer>> getParentChild() {
        return parentChild;
    }

    public void setParentChild(Map<Integer, List<Integer>> parentChild) {
        this.parentChild = parentChild;
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.sourceCode();

    }

    public void sourceCode() {
        List<User> data = userData();
        Gen1 = data.stream().filter(a -> a.getParentId() == null).map(a -> a.getId())
                .collect(Collectors.toList());
        for (Integer parentId : Gen1) {
            Gen2 = data.stream().filter(a -> a.getParentId() != null && a.getParentId().equals(parentId))
                    .map(a -> a.getId()).collect(Collectors.toList());
        }
        for (Integer childId : Gen2) {
            Gen3 = data.stream().filter(a -> a.getParentId() != null && a.getParentId().equals(childId))
                    .map(a -> a.getId()).collect(Collectors.toList());
        }

        for (Integer parent_id : Gen1) {
            List<Integer> child_id = new ArrayList<>();
            child_id = data.stream().filter(a -> a.getParentId() != null && a.getParentId().equals(parent_id))
                    .map(a -> a.getId()).collect(Collectors.toList());
            parentChild.put(parent_id, child_id);

        }

        for (Integer parent_id : Gen1) {
            Map<Integer, List<Integer>> childGrand = new HashMap<>();
            List<Integer> test = new ArrayList<>();
            for (Integer child_id : parentChild.get(parent_id)) {

                test = data.stream().filter(a -> a.getParentId() != null && a.getParentId().equals(child_id))
                        .map(a -> a.getId()).collect(Collectors.toList());
                childGrand.put(child_id, test);

            }
            childGrandChild.put(parent_id, childGrand);
        }

        for (Map.Entry<Integer, Map<Integer, List<Integer>>> parentEntry : childGrandChild.entrySet()) {

            System.out.println("Parent ID: " + parentEntry.getKey());

            for (Map.Entry<Integer, List<Integer>> childEntry : parentEntry.getValue().entrySet()) {

                System.out.println("  Child ID: " + childEntry.getKey());

                for (Integer grandChild : childEntry.getValue()) {
                    System.out.println("    Grandchild ID: " + grandChild);
                }
            }
        }
        // System.out.println("Gen1");
        // for (Integer id : Gen1) {

        // System.out.println(id);
        // }
        // System.out.println("Gen2");
        // for (Integer id : Gen2) {

        // System.out.println(id);
        // }
        // System.out.println("Gen3");
        // for (Integer id : Gen3) {

        // System.out.println(id);
        // }

    }

    public List<User> userData() {
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