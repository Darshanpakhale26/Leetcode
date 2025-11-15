// 3542  Minimum Operations to Convert All Elements to Zero

// Input: nums = [3,1,2,1]

// Output: 3

// Explanation:

// Select subarray [1,3] (which is [1,2,1]), where the minimum non-negative integer is 1. Setting all occurrences of 1 to 0 results in [3,0,2,0].
// Select subarray [2,2] (which is [2]), where the minimum non-negative integer is 2. Setting all occurrences of 2 to 0 results in [3,0,0,0].
// Select subarray [0,0] (which is [3]), where the minimum non-negative integer is 3. Setting all occurrences of 3 to 0 results in [0,0,0,0].
// Thus, the minimum number of operations required is 3.


class Problem_3542 {
    public int minOperations(int[] nums) {
        Set<Integer> uniqueValues = new HashSet<>();
        for (int num : nums) {
            if (num > 0) {
                uniqueValues.add(num);
            }
        }
        return uniqueValues.size();
    }
}
