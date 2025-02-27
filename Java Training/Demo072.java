
class LinearSearch {
    // Method to perform linear search
    public static int search(int arr[], int N, int x) {
        for (int i = 0; i < N; i++) {
            if (arr[i] == x) {
                return i; // Return the index if found
            }
        }
        return -1; // Return -1 if not found
    }
}

public class Demo072 {
    // Driver code
    public static void main(String args[]) {
        int arr[] = {2, 3, 4, 10, 40}; // Example array
        int x = 10; // Element to search for
        LinearSearch obj = new LinearSearch();
        
        // Function call
        int result = obj.search(arr, arr.length, x);
        
        // Output the result
        if (result == -1) {
            System.out.println("Element " + x + " is not present in the array.");
        } else {
            System.out.println("Element " + x + " is present at index " + result + ".");
        }
    }
}
