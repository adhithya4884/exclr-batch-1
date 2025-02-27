public class Demo070 {
    public static void main(String[] args) {
        int[] array = {10, 15, 23, 42, 7, 19, 4, 5};

        System.out.println("Prime numbers in the array:");
        for (int num : array) {
            if (isPrime(num)) {
                System.out.println(num);
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
