import java.util.Scanner;

public class Demo021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        String result = getFizzBizz(number);
        System.out.println(result);
        
        scanner.close();
    }

    public static String getFizzBizz(int x) {
        // Check if the number is negative or zero
        if (x <= 0) {
            return "Error"; // Return "Error" for negative or zero
        }

        // Check for multiples of 3 and 5
        if (x % 3 == 0 && x % 5 == 0) {
            return "FIZZBIZZ"; // Multiple of both 3 and 5
        } else if (x % 3 == 0) {
            return "FIZZ"; // Multiple of 3
        } else if (x % 5 == 0) {
            return "BIZZ"; // Multiple of 5
        } else {
            return String.valueOf(x); // Return the number itself as a string
        }
    }
}
