// 1807 . Evaluate the Bracket Pairs of a String

class Problem_1807 {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> map = new HashMap<>();
        for (List<String> pair : knowledge) {
            map.put(pair.get(0), pair.get(1));
        }

        StringBuilder result = new StringBuilder();
        StringBuilder keyBuilder = new StringBuilder();
        boolean inBracket = false;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                inBracket = true;
                keyBuilder.setLength(0); 
            } else if (c == ')') {
                inBracket = false;
                String key = keyBuilder.toString();
                result.append(map.getOrDefault(key, "?"));
            } else {
                if (inBracket) {
                    keyBuilder.append(c);
                } else {
                    result.append(c);
                }
            }
        }

        return result.toString();
    }
}
