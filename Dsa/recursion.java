public class recursion {
    int i = 0;

    public static void main(String[] args) {
        recursion testa = new recursion();
        testa.test(5, 1, 2);

    }

    public void test(int n, int a, int b) {
        i++;
        if (n > 0) {

            System.out.printf("Test %d", i);
            test(n - 1, 2, 3);

            System.out.println();
        }

    }
}
