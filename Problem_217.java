// 217 Given an array of integers, find if the array contains any duplicates.


// class Problem_217 {
//     public boolean containsDuplicate(int[] nums) {
//         for (int i = 0; i < nums.length; i++) {
//             for (int j = i + 1; j < nums.length; j++) {
//                 if (nums[i] == nums[j]) {
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// }


// optimized approach without using collections

// class Problem_217 {
//     public boolean containsDuplicate(int[] nums) {
//         Arrays.sort(nums); // Sort the array first
//         for (int i = 1; i < nums.length; i++) {
//             if (nums[i] == nums[i - 1]) {
//                 return true; // Found a duplicate
//             }
//         }
//         return false; // No duplicates found
//     }
// }


// optimized approach using HashSet

import java.util.HashSet;
class Problem_217 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true; // Found a duplicate
            }
            seen.add(num);
        }
        return false; // No duplicates found
    }
}

