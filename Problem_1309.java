// 1309 . Decrypt String from Alphabet to Integer Mapping


class Problem_1309 {
    public String freqAlphabets(String s) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        int n = s.length();

        while (i < n) {
            if (i + 2 < n && s.charAt(i + 2) == '#') {
               
                int num = Integer.parseInt(s.substring(i, i + 2));
                result.append((char) ('a' + num - 1));
                i += 3;
            } else {
              
                int num = s.charAt(i) - '0';
                result.append((char) ('a' + num - 1));
                i++; 
            }
        }

        return result.toString();
    }
}
