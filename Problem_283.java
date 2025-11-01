// 283 Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.


class Problem_283 {
    public void moveZeroes(int[] nums) {
        int lastNonZeroIndex = 0;
        
        // Move all non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastNonZeroIndex++] = nums[i];
            }
        }
        
        // Fill the remaining positions with zeros
        for (int i = lastNonZeroIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}

// optimized approach using a single pass
// class Problem_283 {
//     public void moveZeroes(int[] nums) {
//         int lastNonZeroIndex = 0;
        
//         // Single pass to move non-zero elements and fill zeros
//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] != 0) {
//                 if (i != lastNonZeroIndex) {
//                     nums[lastNonZeroIndex] = nums[i];
//                     nums[i] = 0;
//                 }
//                 lastNonZeroIndex++;
//             }
//         }
//     }
// }
