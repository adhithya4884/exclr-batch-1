public class Demo076 {
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 4, 2}; // Example array
        int secondMax = findSecondMax(array);
        System.out.println("Second maximum number in the array: " + secondMax);
    }

    public static int findSecondMax(int[] array) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > max) {
                secondMax = max; // Update second max
                max = num; // Update max
            } else if (num > secondMax && num < max) {
                secondMax = num; // Update second max
            }
        }

        return secondMax;
    }
}
