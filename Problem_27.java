// 27 Given an array nums and a value val, remove all instances of that value in-place and return the new length.

class Problem_27 {
    public int removeElement(int[] nums, int val) {
        int x = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[x] = nums[i];
                x++;
            }
        }
        return x;
    }
}
