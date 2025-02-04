import java.util.Scanner;

public class Demo057 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int lastDigit = number % 10; // Extract the last digit
        int firstDigit = Character.getNumericValue(Integer.toString(number).charAt(0)); // Extract the first digit

        int sum = firstDigit + lastDigit; // Calculate the sum

        System.out.println("The sum of the first and last digits is: " + sum);
        scanner.close();
    }
}
