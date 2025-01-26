import java.util.Scanner;

public class Demo038 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter a character to check (or 'q' to quit): ");
            String input = scanner.nextLine().trim();
            
            if (input.isEmpty()) {
                System.out.println("Please enter a character.");
                continue;
            }
            
            if (input.equalsIgnoreCase("q")) {
                break;
            }
            
            char character = input.charAt(0);
            
            if (Character.isUpperCase(character)) {
                System.out.println(character + " is an uppercase letter.");
            } else if (Character.isLowerCase(character)) {
                System.out.println(character + " is a lowercase letter.");
            } else if (Character.isDigit(character)) {
                System.out.println(character + " is a digit.");
            } else if (Character.isWhitespace(character)) {
                System.out.println(character + " is a whitespace character.");
            } else {
                System.out.println(character + " is a special character.");
            }
        }
        
        System.out.println("Program ended. Goodbye!");
        scanner.close();
    }
}
