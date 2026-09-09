import java.util.Scanner;

public class charCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word!");
        String test1 = sc.nextLine().toLowerCase().replace(" ", "");
        int vowelCounter = 0;
        int consonantsCounter = 0;
        int digits = 0;
        for (char word : test1.toCharArray()) {
            if (word == 'a' || word == 'e' || word == 'i' || word == 'o' || word == 'u') {
                vowelCounter++;
            } else {
                consonantsCounter++;
            }
            digits++;
        }
        System.out.println("Vowel: " + vowelCounter);
        System.out.println("Consonants: " + consonantsCounter);
        System.out.println("Digits: " + digits);
    }
}
