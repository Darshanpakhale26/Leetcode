// 387 Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

// class Problem_387 {
//     public int firstUniqChar(String s) {
//         int[] charCount = new int[26];
        
//         // Count the occurrences of each character
//         for (int i = 0; i < s.length(); i++) {
//             charCount[s.charAt(i) - 'a']++;
//         }
        
//         // Find the first unique character
//         for (int i = 0; i < s.length(); i++) {
//             if (charCount[s.charAt(i) - 'a'] == 1) {
//                 return i;
//             }
//         }
        
//         return -1; // Return -1 if no unique character is found
//     }
// }

// optimized approach using LinkedHashMap to maintain insertion order

import java.util.LinkedHashMap;
class Problem_387 {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character, Integer> charCount = new LinkedHashMap<>();
        
        // Count the occurrences of each character
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        // Find the first unique character
        for (int i = 0; i < s.length(); i++) {
            if (charCount.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        
        return -1; // Return -1 if no unique character is found
    }
}