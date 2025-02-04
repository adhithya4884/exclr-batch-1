import java.util.Scanner;

public class Demo055 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sumOfSquares = 0;

        while (number > 0) {
            int digit = number % 10; // Extract the last digit
            sumOfSquares += digit * digit; // Square the digit and add to sum
            number /= 10; // Remove the last digit
        }

        System.out.println("The sum of squares of the digits is: " + sumOfSquares);
        scanner.close();
    }
}
