import java.util.Arrays;

public class check {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 4, 1, 5 };

        int[] result = new int[arr.length];
        int size = 0;

        for (int i : arr) {

            boolean duplicate = false;

            for (int j = 0; j < size; j++) {
                if (result[j] == i) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                result[size] = i;
                size++;
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.print(result[i] + " ");

        }
        System.out.println(Arrays.toString(result));
    }

}