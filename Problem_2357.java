// Problem 2357 : Make Array Zero by Subtracting Equal Amounts

class Problem_2357 {
    public int minimumOperations(int[] nums) {
        java.util.HashSet<Integer> uniqueNonZero = new java.util.HashSet<>();
        for (int num : nums) {
            if (num != 0) {
                uniqueNonZero.add(num);
            }
        }
        return uniqueNonZero.size();
    }
}







