import java.util.HashSet;

public class Demo073 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 1, 2, 6}; // Example array
        printDuplicates(array);
    }

    public static void printDuplicates(int[] array) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : array) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        if (duplicates.isEmpty()) {
            System.out.println("No duplicates found.");
        } else {
            System.out.println("Duplicate elements: " + duplicates);
        }
    }
}
