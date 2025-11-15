// 3542  Minimum Operations to Convert All Elements to Zero

import java.util.HashSet;
import java.util.Set;
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
