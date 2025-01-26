import java.util.Scanner;

public class Demo043 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an uppercase character: ");
        char input = scanner.next().charAt(0);
        
        
        char lowerCaseChar = Character.toLowerCase(input);
        
        System.out.println("Lowercase character: " + lowerCaseChar);
        
        scanner.close();
    }
}
