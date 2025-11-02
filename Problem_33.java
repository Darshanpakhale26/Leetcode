// 33. Search in Rotated Sorted Array

class Problem_33 {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                return mid; // Target found
            }
            
            // Determine which side is properly sorted
            if (nums[left] <= nums[mid]) { // Left side is sorted
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1; // Target in the left side
                } else {
                    left = mid + 1; // Target in the right side
                }
            } else { // Right side is sorted
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1; // Target in the right side
                } else {
                    right = mid - 1; // Target in the left side
                }
            }
        }
        
        return -1; // Target not found
    }
}


// using collections

import java.util.Arrays;
import java.util.List;
import java.util.Collections;

class Problem_33_Collections {
    public int search(int[] nums, int target) {
        List<Integer> numList = Arrays.stream(nums).boxed().toList();
        int index = Collections.binarySearch(numList, target);
        return index >= 0 ? index : -1;
    }
}