// Problem 1934 : Find the Lucky Numbers in an Array

class Problem_1934_ArrayApproach {
    public int findLucky(int[] arr) {
        int[] frequency = new int[501];

        for (int num : arr) {
            frequency[num]++;
        }

        int largestLucky = -1;

        for (int i = 1; i <= 500; i++) {
            if (frequency[i] == i) {
                largestLucky = Math.max(largestLucky, i);
            }
        }

        return largestLucky;
    }
}