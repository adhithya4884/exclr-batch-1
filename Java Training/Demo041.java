import java.util.Scanner;

public class Demo041 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a character: ");
        char input = scanner.next().charAt(0);
        
        if (isVowel(input)) {
            System.out.println(input + " is a vowel.");
        } else if (Character.isLetter(input)) {
            System.out.println(input + " is a consonant.");
        } else {
            System.out.println(input + " is not a valid letter.");
        }
        
        scanner.close();
    }

    
    public static boolean isVowel(char ch) {
        return "AEIOUaeiou".indexOf(ch) != -1;
    }
}
