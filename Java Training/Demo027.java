import java.util.Scanner;
class demo027{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        //check whether entered number is prime or not
        for(int i = 2; i<=n/2 ; i++){
            if(n%i==0){
                System.out.println(n + " is not a prime number");
                break;
        }else{
            System.out.println(n + " is a prime number");
        }
        
    }
}
}