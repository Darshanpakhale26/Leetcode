// 268 Given an array nums containing n distinct numbers in the range [0, n], find the only number in this range that is missing from the array.

class Problem_268 {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        
        for (int num : nums) {
            actualSum += num;
        }
        
        return expectedSum - actualSum;
    }
}


// alternative approach using XOR

class Problem_268 {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int xorSum = 0;
        
        for (int i = 0; i < n; i++) {
            xorSum ^= i;        // XOR all indices
            xorSum ^= nums[i]; // XOR all numbers in the array
        }
        
        xorSum ^= n; // XOR the last number n
        
        return xorSum; // The result is the missing number
    }
}


// alternative approach using boolean array

class Problem_268 {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        boolean[] present = new boolean[n + 1];
        
        for (int num : nums) {
            present[num] = true;
        }
        
        for (int i = 0; i <= n; i++) {
            if (!present[i]) {
                return i;
            }
        }
        
        return -1; // This line should never be reached
    }
}


// alternative approach using HashSet

import java.util.HashSet;
class Problem_268 {
    public int missingNumber(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        
        int n = nums.length;
        for (int i = 0; i <= n; i++) {
            if (!numSet.contains(i)) {
                return i;
            }
        }
        
        return -1; // This line should never be reached
    }
}


// alternative approach using sorting
import java.util.Arrays;

class Problem_268 {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        
        return n; // If all numbers from 0 to n-1 are present, then n is missing
    }
}

