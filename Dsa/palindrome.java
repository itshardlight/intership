import java.util.Arrays;

class palindrome {
    public static void main(String[] args) {

        String name = "heleh";
        boolean flag = true;
        for (int i = 0; i < name.length(); i++) {
            for (int j = name.length() - 1; j >= 0; j--) {
                if (i + j == name.length() - 1) {
                    if (name.charAt(i) != name.charAt(j)) {
                        flag = false;
                    }
                }
            }

        }
        if (!flag) {
            System.out.println("not palindrome");
        } else {
            System.out.println("It is palindrome");
        }

    }

}