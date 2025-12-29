// Problem 525: Contiguous Array

import java.util.HashMap;
class Problem_525 {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> countIndexMap = new HashMap<>();
        countIndexMap.put(0, -1);
        int maxLength = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            count += (nums[i] == 1) ? 1 : -1;

            if (countIndexMap.containsKey(count)) {
                int prevIndex = countIndexMap.get(count);
                maxLength = Math.max(maxLength, i - prevIndex);
            } else {
                countIndexMap.put(count, i);
            }
        }

        return maxLength;
    }
}