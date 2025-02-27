class ArrayMerger {
    public int[] mergeArrays(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, result, 0, array1.length);
        System.arraycopy(array2, 0, result, array1.length, array2.length);
        return result;
    }
}

public class Demo082 {
    public static void main(String[] args) {
        ArrayMerger merger = new ArrayMerger();
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};

        int[] mergedArray = merger.mergeArrays(array1, array2);

        System.out.println("Merged array:");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }
}
