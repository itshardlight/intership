public class reverseString {

    public static void main(String[] args) {
        String name = "Unish";
        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.print(name.charAt(i));
        }
    }
}
