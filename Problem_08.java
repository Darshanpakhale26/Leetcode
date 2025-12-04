// Problem 08 String to Integer (atoi)

class Problem_08 {
    public int myAtoi(String s) {
        int index = 0, sign = 1, total = 0;
        // 1. Remove Whitespaces
        while (index < s.length() && s.charAt(index) == ' ') {
            index++;
        }
        // 2. Handle signs
        if (index < s.length()) {
            if (s.charAt(index) == '+') {
                sign = 1;
                index++;
            } else if (s.charAt(index) == '-') {
                sign = -1;
                index++;
            }
        }
        // 3. Convert number and avoid overflow
        while (index < s.length()) {
            char c = s.charAt(index);
            if (c < '0' || c > '9') break;

            int digit = c - '0';
            // Check for overflow
            if (total > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            total = total * 10 + digit;
            index++;
        }
        return total * sign;
    }
}
