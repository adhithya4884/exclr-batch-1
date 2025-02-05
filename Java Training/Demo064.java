public class Demo064 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50}; // Example array
        // Swapping the first and last elements
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;

        // Printing the modified array
        System.out.print("Array after swapping: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
