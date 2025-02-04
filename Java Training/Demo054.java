public class Demo054 {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Demo054 demo = new Demo054();
        
        // Calling the overloaded methods
        int intResult = demo.add(5, 10);
        double doubleResult = demo.add(5.5, 10.5);
        
        System.out.println("Sum of integers: " + intResult);
        System.out.println("Sum of doubles: " + doubleResult);
    }
}
