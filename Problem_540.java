// 540. Single Element in a Sorted Array

class Problem_540 {
    public int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            // Ensure mid is even for comparison
            if (mid % 2 == 1) {
                mid--;
            }
            
            // Check if the pair is valid
            if (nums[mid] == nums[mid + 1]) {
                left = mid + 2; // Move to the right half
            } else {
                right = mid; // Move to the left half
            }
        }
        
        return nums[left]; // The single element
    }
}
