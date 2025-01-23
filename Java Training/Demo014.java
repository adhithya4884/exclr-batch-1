import java.util.Scanner;
public class Demo014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x = sc.nextInt();

        
                System.out.println("X: "+x);
        
                System.out.println("Unary Plus: "+(+x));
                System.out.println("Unary Minus: "+(-x));
        
                System.out.println("X: "+x);
                System.out.println("Pre Increment: "+(++x));
                System.out.println("Post Increment: "+(x++));
        
                System.out.println("X: "+x);
                System.out.println("Pre Decrement: "+(--x));
                System.out.println("Post Decrement: "+(x--));
        
                boolean b = true;
                System.out.println("Original boolean value: " + b);
                System.out.println("Logical NOT: " + (!b));
        
        }
        }

    

