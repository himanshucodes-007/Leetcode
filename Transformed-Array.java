1class Solution {
2    public int[] constructTransformedArray(int[] nums) {
3        int n = nums.length;
4        int[] result = new int[n];
5
6        for (int i = 0; i < n; i++) {
7            int move = nums[i] % n;   // normalize large jumps
8            int j = (i + move) % n;
9            if (j < 0) j += n;        // fix negative index
10            result[i] = nums[j];
11        }
12        return result;
13    }
14}
15