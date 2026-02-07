// Problem 415: Add Strings



class Problem_415 {
    public String addStrings(String num1, String num2) {
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        int sum = n1 + n2;
        return Integer.toString(sum);
    }

    public static void main(String[] args) {
        Problem_415 solution = new Problem_415();
        String num1 = "123";
        String num2 = "456";
        String result = solution.addStrings(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);
    }
}



