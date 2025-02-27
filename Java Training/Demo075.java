public class Demo075 {
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 4, 2}; 
        int max = findMax(array);
        System.out.println("Maximum number in the array: " + max);
    }

    public static int findMax(int[] array) {
        int max = array[0]; 
        for (int num : array) {
            if (num > max) {
                max = num; 
            }
        }
        return max;
    }
}
