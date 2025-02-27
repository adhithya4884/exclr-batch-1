import java.util.Scanner;

class English01 {
    void CheckVowelOrConsonant() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        char ch = str.charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("First character is Vowel");
        } else {
            System.out.println("First character is Consonant");
        }
    }
}

public class Demo083 {
    public static void main(String[] args) {
        English01 s = new English01();
        s.CheckVowelOrConsonant();
    }
}
