1class Solution {
2    int[][] dp;
3    public int coinChange(int[] coins, int amount) {
4        int n = coins.length;
5
6        dp = new int[n][amount+1];
7        for(int[] row : dp){
8            Arrays.fill(row, -1);
9        }
10
11        int ans = solve(n-1,amount,coins);
12        return ans >= Integer.MAX_VALUE ? -1 : ans;
13    }
14
15    public int solve(int i, int target, int[] coins){
16        if(i==0){
17            if(target %coins[0] ==0){
18                return target/coins[0];
19            }
20
21            return Integer.MAX_VALUE;
22        }
23
24        if(dp[i][target] != -1) return dp[i][target];
25
26        int notTake= solve(i-1,target,coins);
27
28        int take = Integer.MAX_VALUE;
29
30        if (coins[i] <= target) {
31            int res = solve(i, target - coins[i], coins);
32
33            if (res != Integer.MAX_VALUE) {
34                take = 1 + res;
35            }
36        }
37
38        return dp[i][target] = Math.min(take,notTake);
39    }
40}