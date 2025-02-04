import java.util.Scanner;

public class Demo056 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sumOfCubes = 0;

        while (number > 0) {
            int digit = number % 10; // Extract the last digit
            sumOfCubes += digit * digit * digit; // Cube the digit and add to sum
            number /= 10; // Remove the last digit
        }

        System.out.println("The sum of cubes of the digits is: " + sumOfCubes);
        scanner.close();
    }
}
