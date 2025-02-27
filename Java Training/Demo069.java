public class Demo069 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50}; 
        int sum = 0;


        for (int num : array) {
            sum += num;
        }


        System.out.println("The sum of all elements in the array is: " + sum);
    }
}
