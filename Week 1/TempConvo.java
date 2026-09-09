import java.util.Scanner;

public class TempConvo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the Conversion Type");
        System.out.println("Choice 1: Convert Celcius to Fahrenheit:");
        System.out.println("Choice 2: Convert Fahrenheit to Celcius:");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter the value in Celcius");
                double celcius = sc.nextInt();
                System.out.println("Value in Fahrenheit is " + ((celcius * 9 / 5) + 32));
                break;

            case 2:
                System.out.println("Enter the value in Fahrenheit");
                double fahrenheit = sc.nextInt();
                System.out.println("Value in Celcius is " + ((fahrenheit - 32) * 5 / 9));
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }

    }
}
