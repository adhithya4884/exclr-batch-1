import java.util.Scanner;

class Customer {
    String Cust_Name = "Sai Adithya";
    long Account_no = 123456;
    Double Balance = 10000.00;

    void accept_details() {
        System.out.println("Enter your name and account number:");
        Scanner sc = new Scanner(System.in);
        Cust_Name = sc.nextLine();
        Account_no = sc.nextLong();
        System.out.print("Enter your balance: ");
        Balance = sc.nextDouble(); // Uncommented to accept balance
    }

    void Display_details() {
        System.out.println("Hello " + Cust_Name);
        System.out.println("Your balance is " + Balance);
    }
}

public class Demo010 {
    public static void main(String[] args) {
        Customer obj = new Customer();
        obj.accept_details();
        obj.Display_details();
    }
}
