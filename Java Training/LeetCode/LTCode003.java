class Solution3 {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0;

        int sign = 1, index = 0, result = 0;

        // sign +or-
        if (s.charAt(index) == '-' || s.charAt(index) == '+') {
            sign = (s.charAt(index) == '-') ? -1 : 1;
            index++;
        }

        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            int digit = s.charAt(index) - '0';

            
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            index++;
        }

        return result * sign;
    }
}

public class LTCode003 {
    public static void main(String[] args) {
        Solution3 s = new Solution3();
        System.out.println(s.myAtoi("-42"));
    }
}
