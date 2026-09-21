public class factorial {
    public static void main(String[] args) {
        int fac = 6;
        int test = 1;
        int factorial = 1;

        for (int i = 1; i <= fac; i++) {
            factorial = factorial * i;

        }

        System.out.println(factorial);
    }
}
