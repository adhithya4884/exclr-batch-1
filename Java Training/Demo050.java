public class Demo050 {
    public static void main(String[] args) {
        int number = 5; // The number for which the table is to be printed
        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
