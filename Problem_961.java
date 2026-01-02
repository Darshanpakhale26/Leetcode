// Problem 961 : N-Repeated Element in Size 2N Array

class Problem_961 {
    public int repeatedNTimes(int[] nums) {
        java.util.HashSet<Integer> seen = new java.util.HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {  
                return num;
            }
            seen.add(num);
        }
        return -1;
    }
}
