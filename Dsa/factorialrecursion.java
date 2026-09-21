import java.util.HashSet;

public class factorialrecursion {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 2, 4, 3, 4, 3, 1, 2, 2, 1, 1 };

        HashSet<Integer> printed = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            int counter = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    counter++;
                }
            }

            if (!printed.contains(arr[i])) {
                System.out.printf("%d = %d%n", arr[i], counter);
                printed.add(arr[i]);
            }
        }
    }
}