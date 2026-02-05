// Problem 3289 The Two Sneaky Numbers of Digitville

// using HashSet to track seen numbers

import java.util.HashSet;
class Problem_3289 {
    public int[] findSneakyNumbers(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        int firstSneaky = -1;
        int secondSneaky = -1;

        for (int num : nums) {
            if (seen.contains(num)) {
                if (firstSneaky == -1) {
                    firstSneaky = num;
                } else if (secondSneaky == -1 && num != firstSneaky) {
                    secondSneaky = num;
                }
            } else {
                seen.add(num);
            }
        }

        return new int[]{firstSneaky, secondSneaky};
    }
    public static void main(String[] args) {
        Problem_3289 solution = new Problem_3289();
        int[] nums = {1, 2, 3, 4, 5, 2, 6, 7, 8, 9, 10, 1};
        int[] result = solution.findSneakyNumbers(nums);
        System.out.println("The two sneaky numbers are: " + result[0] + " and " + result[1]);
    }
}

