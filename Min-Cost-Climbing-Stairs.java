1class Solution {
2    ;
3    public int minCostClimbingStairs(int[] cost) {
4        int n = cost.length;
5
6        int first = cost[0];
7        int second = cost[1];
8
9        if(n<= 2) return Math.min(first,second);
10        for(int i=2;i<n;i++){
11            int curr = cost[i]+Math.min(first,second);
12            first = second;
13            second = curr;
14        }
15        return Math.min(first,second);
16    }
17}