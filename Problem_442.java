// Problem 442 : Find All Duplicates in an Array

import java.util.ArrayList;
import java.util.List;


public class Problem_442 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1; 
            if (nums[index] < 0) {
                duplicates.add(index + 1);
            } else {
                nums[index] = -nums[index];
            }
        }
        return duplicates;
    }
    public static void main(String[] args) {
        Problem_442 solution = new Problem_442();
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> result = solution.findDuplicates(nums);
        System.out.println("The duplicate numbers are: " + result);
    }
}
