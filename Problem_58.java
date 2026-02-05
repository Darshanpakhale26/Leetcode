// Problem 58 : Length of Last Word

class Problem_58 {
    public int lengthOfLastWord(String s) {
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (length > 0) {
                    break;
                }
            } else {
                length++;
            }
        }

        return length;
    }

    public static void main(String[] args) {
        Problem_58 solution = new Problem_58();
        String s = "   fly me   to   the moon     ";
        int result = solution.lengthOfLastWord(s);
        System.out.println("The length of the last word is: " + result);
    }
}
