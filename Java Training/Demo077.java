public class Demo077 {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5}; // Example original array
        int[] copiedArray = new int[originalArray.length]; // Create a new array for copying

        // Copy elements from originalArray to copiedArray
        for (int i = 0; i < originalArray.length; i++) {
            copiedArray[i] = originalArray[i];
        }

        // Print the copied array
        System.out.print("Copied array: ");
        for (int num : copiedArray) {
            System.out.print(num + " ");
        }
    }
}
