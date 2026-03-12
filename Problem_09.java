// Problem 11: Palindrome Number

class Problem_09 {
    public boolean isPalindrome(int x) {
        // Negative numbers are not palindromes
        if (x < 0) {
            return false;
        }

        // Convert the number to a string and check if it reads the same forwards and backwards
        String str = Integer.toString(x);
        String reversedStr = new StringBuilder(str).reverse().toString();

        return str.equals(reversedStr);
    }

    public static void main(String[] args) {
        Problem_09 solution = new Problem_09();
        int number = 121;
        boolean result = solution.isPalindrome(number);
        System.out.println("Is the number a palindrome? " + result);
    }
}
