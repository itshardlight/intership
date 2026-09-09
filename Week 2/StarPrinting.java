public class StarPrinting {
    public static void main(String[] args) {
        // right angle triangle printing
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        System.out.println("This is right angle triangle");

        // piramid printing
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");

            }
            System.out.println();
        }

        System.out.println("This is pyramid");
    }
}
