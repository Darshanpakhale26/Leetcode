//26 Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.

class Problem_26 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int x = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[x]) {
                x++;
                nums[x] = nums[i];
            }
        }
        return x + 1;
    }
}




