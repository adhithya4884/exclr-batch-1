import java.util.Scanner;

public class Demo042 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a lowercase character: ");
        char input = scanner.next().charAt(0);
        
        // Convert to uppercase
        char upperCaseChar = Character.toUpperCase(input);
        
        System.out.println("Uppercase character: " + upperCaseChar);
        
        scanner.close();
    }
}
