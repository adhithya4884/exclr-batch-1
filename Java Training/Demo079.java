import java.util.Scanner;

class Search {
    public boolean isElementFound(int[] array, int element) {
        for (int num : array) {
            if (num == element) {
                return true;
            }
        }
        return false;
    }
}

public class Demo079 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Search search = new Search();

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to search for: ");
        int element = scanner.nextInt();

        boolean found = search.isElementFound(array, element);
        if (found) {
            System.out.println("Element " + element + " is found in the array.");
        } else {
            System.out.println("Element " + element + " is not found in the array.");
        }
    }
}
