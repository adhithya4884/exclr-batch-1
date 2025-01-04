public class Demo7 {
    public static void main(String[] args) {
        String username = "vinni";
        String password = "vinni123";
        String greeting = "Happy New Year";

        while ((username.equals("vinni")) && (password.equals("vinni123")) && (greeting.equals("Happy New Year"))) {
            System.out.println("Hello " + username + ", " + greeting + "!");
            break; // Exit the loop after printing the message
        }
    }
}