// 410 . Split Array Largest Sum

class Solution {
    public int splitArray(int[] nums, int m) {
        int left = 0, right = 0;
        for (int num : nums) {
            left = Math.max(left, num);
            right += num;
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canSplit(nums, m, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private boolean canSplit(int[] nums, int m, int maxSum) {
        int currentSum = 0;
        int splits = 1;

        for (int num : nums) {
            currentSum += num;
            if (currentSum > maxSum) {
                splits++;
                currentSum = num;
                if (splits > m) {
                    return false;
                }
            }
        }

        return true;
    }
}
