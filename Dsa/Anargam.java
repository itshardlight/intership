import java.util.Arrays;

public class Anargam {
    public static void main(String[] args) {
        String st1 = "unish";
        String st2 = "hsniu";
        Boolean anargan = true;

        if (st1.length() != st2.length()) {
            anargan = false;
        }

        else {
            char[] st1Arr = st1.toCharArray();
            char[] st2Arr = st2.toCharArray();

            Arrays.sort(st1Arr);
            Arrays.sort(st2Arr);
            if (Arrays.equals(st1Arr, st2Arr)) {
                anargan = true;
            } else {
                anargan = false;
            }
        }

        if (anargan) {
            System.out.println("It is anargan!");
        } else {
            System.out.println("It is not anargan!");
        }
    }
}