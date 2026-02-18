// Problem 2942: find Words Containing character

import java.util.ArrayList;
import java.util.List;
class Problem_2942 {
    public List<String> findWords(String[] words, char ch) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (word.indexOf(ch) != -1) {
                result.add(word);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Problem_2942 solution = new Problem_2942();
        String[] words = {"hello", "world", "java", "programming"};
        char ch = 'o';
        List<String> result = solution.findWords(words, ch);
        System.out.println("Words containing the character '" + ch + "': " + result);
    }
}
