public class Demo007 {
    public static void main(String[] args) {
        String username = "sai";
        String password = "sai123";
        String greeting = "Happy New Year";

        while ((username.equals("sai")) && (password.equals("sai123")) && (greeting.equals("Happy New Year"))) {
            System.out.println("Hello " + username + ", " + greeting + "!");
            break; // Exit the loop after printing the message
        }
    }
}