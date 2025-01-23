
import java.util.Scanner;
class Demo024{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:  ");
        String str = sc.nextLine();
        String rev = new StringBuilder(str).reverse().toString();
        System.out.println("entered string is:  "+str);
        System.out.println("Reversed String: "+rev);
}
}
