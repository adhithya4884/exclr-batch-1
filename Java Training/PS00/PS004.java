public class PS004 {
    private double basePay;
    private int hoursWorked;

    // Parameterized constructor
    public PS004(double basePay, int hoursWorked) {
        this.basePay = basePay;
        this.hoursWorked = hoursWorked;
    }

    // Default constructor
    public PS004() {
        this.basePay = 8.00; // Default base pay
        this.hoursWorked = 0; // Default hours worked
    }

    // Method to compute salary
    public void computeSalary() {
        final double MINIMUM_WAGE = 8.00;
        final int MAX_HOURS = 60;
        double totalPay;

        // Check for errors
        if (basePay < MINIMUM_WAGE) {
            System.out.println("Error: Base pay cannot be less than the minimum wage of $" + MINIMUM_WAGE);
            return;
        }

        if (hoursWorked > MAX_HOURS) {
            System.out.println("Error: Hours worked cannot exceed " + MAX_HOURS + " hours.");
            return;
        }

        // Calculate total pay
        if (hoursWorked <= 40) {
            totalPay = basePay * hoursWorked;
        } else {
            double regularPay = basePay * 40;
            double overtimePay = (hoursWorked - 40) * (basePay * 1.5);
            totalPay = regularPay + overtimePay;
        }

        // Print the total pay
        System.out.printf("Total pay for employee with base pay $%.2f and hours worked %d: $%.2f%n", basePay, hoursWorked, totalPay);
    }

    public static void main(String[] args) {
        // Create instances of Client for each employee
        PS004 employee1 = new PS004(7.50, 35);
        PS004 employee2 = new PS004(8.20, 47);
        PS004 employee3 = new PS004(10.00, 3);

        // Compute and print salaries
        employee1.computeSalary();
        employee2.computeSalary();
        employee3.computeSalary();
    }
}
