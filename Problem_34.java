// 34. Find First and Last Position of Element in Sorted Array

class Problem_34 {
    public int[] searchRange(int[] nums, int target) {
        int first = findFirstPosition(nums, target);
        int last = findLastPosition(nums, target);
        return new int[] {first, last};
    }
    
    private int findFirstPosition(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int firstPos = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                firstPos = mid; // Potential first position found
                right = mid - 1; // Continue searching in the left half
            } else if (nums[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        
        return firstPos;
    }
    
    private int findLastPosition(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int lastPos = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                lastPos = mid; // Potential last position found
                left = mid + 1; // Continue searching in the right half
            } else if (nums[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        
        return lastPos;
    }
}

// Using Collections

import java.util.Arrays;
import java.util.List;
import java.util.Collections;

class Problem_34_Collections {
    public int[] searchRange(int[] nums, int target) {
        List<Integer> numList = Arrays.stream(nums).boxed().toList();
        int firstIndex = Collections.binarySearch(numList, target);
        
        if (firstIndex < 0) {
            return new int[] {-1, -1}; // Target not found
        }
        
        // Find the first occurrence
        int firstPos = firstIndex;
        while (firstPos > 0 && numList.get(firstPos - 1) == target) {
            firstPos--;
        }
        
        // Find the last occurrence
        int lastPos = firstIndex;
        while (lastPos < numList.size() - 1 && numList.get(lastPos + 1) == target) {
            lastPos++;
        }
        
        return new int[] {firstPos, lastPos};
    }
}




