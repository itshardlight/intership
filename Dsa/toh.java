public class toh {
    public static void main(String[] args) {
        toh test = new toh();
        test.tohMethod(5, 'a', 'b', 'c');
    }

    public void tohMethod(int n, char a, char b, char c) {
        if (n > 0) {
            tohMethod(n - 1, a, c, b);
            System.out.printf("Move a disc from %c to %c", a, c);
            System.out.println();
            tohMethod(n - 1, b, c, a);
        }

    }
}
