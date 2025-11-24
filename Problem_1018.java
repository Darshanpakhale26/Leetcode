// 1018. Binary Prefix Divisible By 5

class Solution {
    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> result = new ArrayList<>();
        int prefix = 0;
        for (int i = 0; i < A.length; i++) {
            prefix = ((prefix << 1) + A[i]) % 5;
            result.add(prefix == 0);
        }
        return result;
    }
}
