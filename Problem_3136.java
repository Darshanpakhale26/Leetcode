// Problem 3136 : Valid Word

//  word is considered valid if:

// It contains a minimum of 3 characters.
// It contains only digits (0-9), and English letters (uppercase and lowercase).
// It includes at least one vowel.
// It includes at least one consonant.
// You are given a string word.

// Return true if word is valid, otherwise, return false.


class Problem_3136 {
    public boolean isValid(String word) {
        if (word.length() < 3) {
            return false;
        }

        boolean hasVowel = false;
        boolean hasConsonant = false;

        for (char ch : word.toCharArray()) {
            if (Character.isDigit(ch) || Character.isLetter(ch)) {
                char lowerCh = Character.toLowerCase(ch);
                if ("aeiou".indexOf(lowerCh) != -1) {
                    hasVowel = true;
                } else if (Character.isLetter(ch)) {
                    hasConsonant = true;
                }
            } else {
                return false; 
            }
        }

        return hasVowel && hasConsonant;
    }
}
