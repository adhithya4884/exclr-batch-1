import java.util.Scanner;

public class Demo029 {
    public static void main(String[] args) {
        String[][] friends = new String[10][3]; // 10 friends, 3 details each
        Scanner scanner = new Scanner(System.in);

        // Input friends' details
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for friend " + (i + 1) + ":");
            System.out.print("Name: ");
            friends[i][0] = scanner.nextLine();
            System.out.print("Age: ");
            friends[i][1] = scanner.nextLine();
            System.out.print("City: ");
            friends[i][2] = scanner.nextLine();
        }

        // Display friends' details
        System.out.println("\nFriends' Details:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Friend " + (i + 1) + ":");
            System.out.println("Name: " + friends[i][0]);
            System.out.println("Age: " + friends[i][1]);
            System.out.println("City: " + friends[i][2]);
            System.out.println();
        }

        scanner.close();
    }
}