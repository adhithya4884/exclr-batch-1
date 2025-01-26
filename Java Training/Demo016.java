class Demo016 {
    public static void main(String[] args) {

                String input = "madam";
                String reversed = new StringBuilder(input).reverse().toString();
        
                if (input.equals(reversed)) {
                    System.out.println("The string \"" + input + "\" is a palindrome.");
                } else {
                    System.out.println("The string \"" + input + "\" is not a palindrome.");
                }
            }
        }
