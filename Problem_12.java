// Problem 12: Integer to Roman

class Problem_12 {
    public String intToRoman(int num) {
        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        return thousands[num / 1000] + 
               hundreds[(num % 1000) / 100] + 
               tens[(num % 100) / 10] + 
               ones[num % 10];
    }

    public static void main(String[] args) {
        Problem_12 solution = new Problem_12();
        int number = 1994;
        String result = solution.intToRoman(number);
        System.out.println("The Roman numeral representation of the number is: " + result);
    }
}