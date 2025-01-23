import java.util.Scanner;

public class Test002 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String input;
            while (true) {
                System.out.print("Enter yes or no: ");
                input = sc.nextLine().trim();

                if ("yes".equalsIgnoreCase(input)) {
                    System.out.println("Happy Sankranthi");
                } else {
                    System.out.println("Exiting the program.");
                    break;
                }
            }
        }
    }
}
