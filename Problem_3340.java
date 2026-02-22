// Problem 3340: Check Balanced String

// You are given a string num consisting of only digits. A string of digits is called balanced if the sum of the digits at even indices is equal to the sum of digits at odd indices.

// Return true if num is balanced, otherwise return false.

class Problem_3340 {
    public boolean isBalanced(String num) {
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';  // Convert character to integer
            if (i % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }
        }

        return evenSum == oddSum;
    }

    public static void main(String[] args) {
        Problem_3340 solution = new Problem_3340();
        String num = "24123";
        boolean result = solution.isBalanced(num);
        System.out.println("Is the string balanced? " + result);
    }
}