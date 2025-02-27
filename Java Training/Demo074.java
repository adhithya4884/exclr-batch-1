public class Demo074 {
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 4, 2
        }; 
        sortArray(array);
        System.out.print("Sorted array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void sortArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
