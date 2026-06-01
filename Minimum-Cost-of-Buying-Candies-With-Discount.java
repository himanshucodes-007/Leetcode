1class Solution {
2
3    public int minimumCost(int[] cost) {
4        Arrays.sort(cost);
5        int res = 0;
6        int n = cost.length;
7        for (int i = n - 1; i >= 0; --i) {
8            if ((n - 1 - i) % 3 != 2) {
9                res += cost[i];
10            }
11        }
12        return res;
13    }
14}