import java.util.Scanner;

public class Demo026 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        int vowelsCount = countVowels(input);
        int consonantsCount = countConsonants(input);
        
        System.out.println("Number of vowels: " + vowelsCount);
        System.out.println("Number of consonants: " + consonantsCount);
        
        scanner.close();
    }

    // Method to count vowels
    public static int countVowels(String str) {
        int count = 0;
        String vowels = "AEIOUaeiou"; // Vowels in both uppercase and lowercase
        
        for (char ch : str.toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }
        
        return count;
    }

    // Method to count consonants
    public static int countConsonants(String str) {
        int count = 0;
        String vowels = "AEIOUaeiou"; // Vowels in both uppercase and lowercase
        
        for (char ch : str.toCharArray()) {
            // Check if the character is a letter and not a vowel
            if (Character.isLetter(ch) && vowels.indexOf(ch) == -1) {
                count++;
            }
        }
        
        return count;
    }
}
