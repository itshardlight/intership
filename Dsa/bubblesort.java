import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 4 };
        int cache = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {

                    cache = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = cache;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
