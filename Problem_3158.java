// Problem 3158: Find the XOR of numbers which aperars twice
// 

class Problem_3158 {
    public int findXOR(int[] nums) {
        int xorResult = 0;
        for (int num : nums) {
            xorResult ^= num;
        }
        return xorResult;
    }
    public static void main(String[] args) {
        Problem_3158 solution = new Problem_3158();
        int[] nums = {1, 2, 3, 2, 1};
        int result = solution.findXOR(nums);
        System.out.println("The XOR of numbers that appear twice is: " + result);
    }
}
