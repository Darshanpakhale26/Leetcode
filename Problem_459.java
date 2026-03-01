// Problem 459: Repeated Substring Pattern

class Problem_459 {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                String substring = s.substring(0, i);
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < n / i; j++) {
                    sb.append(substring);
                }
                if (sb.toString().equals(s)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Problem_459 solution = new Problem_459();
        String s = "abcabcabc";
        boolean result = solution.repeatedSubstringPattern(s);
        System.out.println("Does the string have a repeated substring pattern? " + result);
    }
}