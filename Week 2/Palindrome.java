import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter a string!");
        Scanner sc = new Scanner(System.in);
        // removing the space and making all the char to lower
        String test1 = sc.nextLine().toLowerCase().replace(" ", "");
        int length = 0;
        for (int num : test1.toCharArray()) {
            length++;
        }
        int j = length - 1;
        boolean isPalindrome = true;
        for (int i = 0; i < length / 2; i++) {
            if (test1.charAt(i) != test1.charAt(j)) {
                isPalindrome = false;

            } else {
                j--;
            }
        }
        if (isPalindrome) {
            System.out.println("It is Palindrome");
        } else {
            System.out.println("It is not a Palindrome");
        }
    }
}
