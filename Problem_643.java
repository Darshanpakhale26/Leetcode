// Problem 643 : Maximum Average Subarray I

class Problem_643 {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int currentSum = 0;

       
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }

        int maxSum = currentSum;

  
        for (int i = k; i < n; i++) {
            currentSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, currentSum);
        }

        return (double) maxSum / k;
    }
}