// Problem 28: Find the Index of the First Occurrence in a String

class Problem_28 {
    public int strStr(String haystack, String needle) {

        if (needle.isEmpty()) {
            return 0;
        }

        int haystackLength = haystack.length();
        int needleLength = needle.length();

        for (int i = 0; i <= haystackLength - needleLength; i++) {
            if (haystack.substring(i, i + needleLength).equals(needle)) {
                return i;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        Problem_28 solution = new Problem_28();
        String haystack = "hello";
        String needle = "ll";
        int result = solution.strStr(haystack, needle);
        System.out.println("The index of the first occurrence is: " + result);
    }
}
