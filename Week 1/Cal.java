import java.util.Scanner;

public class Cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the operator +,-,*,/");
        String operator = sc.nextLine();
        System.out.println("Enter the first number:");
        int number1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int number2 = sc.nextInt();

        if (operator.equals("+")) {
            System.out.println(add(number1, number2));
        } else if (operator.equals("*")) {
            System.out.println(mul(number1, number2));
        } else if (operator.equals("-")) {
            System.out.println(sub(number1, number2));
        } else if (operator.equals("/") && number2 != 0) {
            System.out.println(div(number1, number2));
        }
        if (number2 == 0) {
            System.out.println("Number cannot be Divided by 0");
        }

    }

    public static int add(int number1, int number2) {
        return number1 + number2;
    }

    public static int sub(int number1, int number2) {
        return number1 - number2;
    }

    public static int mul(int number1, int number2) {
        return number1 * number2;
    }

    public static float div(int number1, int number2) {
        return number1 / number2;
    }
}
