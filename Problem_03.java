// 3 Longest Substring Without Repeating Characters

import java.util.HashMap;
class Problem_03 {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> charIndexMap = new HashMap<>();
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            if (charIndexMap.containsKey(currentChar)) {
                // Move the left pointer to the right of the last occurrence of currentChar
                left = Math.max(left, charIndexMap.get(currentChar) + 1);
            }
            charIndexMap.put(currentChar, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}

// without using collections
 
import java.util.Arrays;
import java.util.List;

class Problem_03_No_Collections {
    public int lengthOfLongestSubstring(String s) {
        int[] index = new int[128]; // ASCII character set
        Arrays.fill(index, -1);
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            if (index[currentChar] >= left) {
                left = index[currentChar] + 1;
            }
            index[currentChar] = right;
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
