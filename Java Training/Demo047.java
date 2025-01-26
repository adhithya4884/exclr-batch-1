import java.util.Scanner;

public class Demo047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        
        int count = 0;
        int temp = n;

        while (temp != 0) {
            temp /= 10;
            count++;
        }

        System.out.println("The number of digits in " + n + " is: " + count);
    }
}
