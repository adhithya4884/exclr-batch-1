import java.util.Scanner;

public class Demo020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of terms for Fibonacci series: ");
        int terms = scanner.nextInt();
        
        String result = getFibonacciSeries(terms);
        System.out.println(result);
        
        scanner.close();
    }

    public static String getFibonacciSeries(int n) {
        // Check if the input number is zero or negative
        if (n <= 0) {
            return "0"; // Return "0" for zero or negative input
        }

        StringBuilder fibonacciSeries = new StringBuilder();
        int a = 0, b = 1;

        // Generate Fibonacci series
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                fibonacciSeries.append(a); // First term
            } else if (i == 1) {
                fibonacciSeries.append(",").append(b); // Second term
            } else {
                int next = a + b; // Next term
                fibonacciSeries.append(",").append(next);
                a = b; // Update a to the last term
                b = next; // Update b to the next term
            }
        }

        return fibonacciSeries.toString(); // Return the series as a string
    }
}