import java.util.Scanner;

public class Demo037 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input four numbers
        System.out.print("Enter four numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        
        
        int largest = num1; 
        
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }
        if (num4 > largest) {
            largest = num4;
        }
        
        
        System.out.println("The largest number is: " + largest);
        
        scanner.close();
    }
}
