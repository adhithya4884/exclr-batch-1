import java.util.Scanner;

public class Demo023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        int result = isPalindrome(number);
        
        if (result == 1) {
            System.out.println(number + " is a palindrome.");
        } else if (result == 0) {
            System.out.println(number + " is not a palindrome.");
        } else {
            System.out.println("The number is negative or zero.");
        }
        
        scanner.close();
    }

    public static int isPalindrome(int x) {
        // Check if the number is negative or zero
        if (x <= 0) {
            return -1; // Return -1 for negative or zero
        }

        int originalNumber = x;
        int reversedNumber = 0;

        // Reverse the number
        while (x > 0) {
            int digit = x % 10; // Get the last digit
            reversedNumber = reversedNumber * 10 + digit; // Build the reversed number
            x /= 10; // Remove the last digit
        }

        // Check if the original number is equal to the reversed number
        if (originalNumber == reversedNumber) {
            return 1; // It's a palindrome
        } else {
            return 0; // It's not a palindrome
        }
    }
}