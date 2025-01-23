public class Test004 {
    private String name;
    private String phoneNumber; // Changed to String
    private String address;

    public Test004(String name, String phoneNumber, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() { // Updated return type
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) { // Updated parameter type
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        Test004 friend1 = new Test004("John Doe", "1234567890", "123 Main St, City"); // Corrected instantiation
        System.out.println("Here are your friend's details:");
        friend1.displayDetails();

        System.out.println("\nUpdating friend's information...");
        friend1.setPhoneNumber("987654321"); // Updated to String
        friend1.setAddress("456 Elm St, Town");

        System.out.println("\nUpdated friend's details:");
        friend1.displayDetails();
    }
}
