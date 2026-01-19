// Problem 205 : Isomorphic Strings

import java.util.HashMap;
class Problem_205 {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if (!mapST.containsKey(charS)) {
                mapST.put(charS, charT);
            } else if (mapST.get(charS) != charT) {
                return false;
            }

            if (!mapTS.containsKey(charT)) {
                mapTS.put(charT, charS);
            } else if (mapTS.get(charT) != charS) {
                return false;
            }
        }

        return true;
    }
}
