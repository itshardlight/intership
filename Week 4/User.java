import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class User {

    public void createUser() {
        Scanner sc = new Scanner(System.in);
        String name;
        String name2;
        boolean exists = false;
        System.out.println("Enter your name");
        name = sc.nextLine().replace(" ", "");
        try {
            FileWriter file = new FileWriter("users.txt", true);
            BufferedReader reader = new BufferedReader(new FileReader("users.txt"));
            while ((name2 = reader.readLine()) != null) {
                if (name.equalsIgnoreCase(name2)) {
                    exists = true;
                    break;
                }
            }

            if (!exists) {
                file.write(name + "\n");
                file.close();
                System.out.println("User Created Sucessfully!");
            } else {
                System.out.println("Username already used!");
            }

        } catch (Exception e) {
            System.out.println("Unable to Create User!");
            System.out.println(e);
        }
    }

    public void removeUser() {
        Scanner sc = new Scanner(System.in);
    }
}
