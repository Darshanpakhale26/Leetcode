// 2016 Maximum Difference Between Increasing Elements

public class Problem_2016 {
    public int maximumDifference(int[] nums) {
        int minValue = Integer.MAX_VALUE;
        int maxDiff = -1;

        for (int num : nums) {
            if (num > minValue) {
                maxDiff = Math.max(maxDiff, num - minValue);
            } else {
                minValue = num;
            }
        }

        return maxDiff;
    }
}
