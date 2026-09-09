public class IntArray {
    public static void main(String[] args) {
        int[] intArray = { 2, 3, 4, 5, 6, 8, 1 };
        int largest = intArray[0];
        int smallest = intArray[0];
        int total = 0;
        int count = 0;
        // for each for finding the length of array (array.length) alternative
        for (int num : intArray) {
            count++;
        }
        // using for loop to find max and min of the array
        for (int i = 0; i < count; i++) {
            if (largest < intArray[i]) {
                largest = intArray[i];
            }
            if (smallest > intArray[i]) {
                smallest = intArray[i];
            }
            total += intArray[i];
        }
        System.out.println("Maximum number is: " + largest);
        System.out.println("Minimun number is: " + smallest);
        System.out.println("Average number is: " + total / count);
    }
}
