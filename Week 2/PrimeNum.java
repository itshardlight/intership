public class PrimeNum {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            boolean isPrime = false;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                } else {
                    isPrime = true;
                }
            }
            if (isPrime || i == 1) {
                System.out.println(i);
            }
        }
    }
}
