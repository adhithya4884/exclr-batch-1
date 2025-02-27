import java.util.Scanner;

public class Demo080 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Shift elements to the left
        int firstElement = array[0];
        for (int i = 1; i < n; i++) {
            array[i - 1] = array[i];
        }
        array[n - 1] = firstElement; // Move the first element to the last position

        System.out.println("Array after shifting: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
