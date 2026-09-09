import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.println("Enter your name:");
        String name = scanner.nextLine();
        System.err.println("Enter your age:");
        int age = scanner.nextInt();

        System.err.println("Your name is: " + name + " \n Your age is: " + age);
    }
}