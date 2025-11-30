// Problem 2154. Keep Multiplying Found Values by Two

class Problem_2154 {

    public int findFinalValue(int[] nums, int original) {

        for (int num : nums) {
            if (num == original) {
                original *= 2;

                break;
            }
        }

        return original;
    }
}
