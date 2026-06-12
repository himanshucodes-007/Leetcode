1class Solution {
2    int[][] dp;
3    public int maxProfit(int[] prices, int fee) {
4        int n = prices.length;
5
6        int[][] dp = new int[n+1][2];
7
8        for(int i = n-1; i>= 0; i--){
9            dp[i][1] = Math.max(-prices[i] + dp[i+1][0], dp[i+1][1]);
10
11            dp[i][0] = Math.max(prices[i] - fee+ dp[i+1][1] , dp[i+1][0]);
12        }
13
14        return dp[0][1];
15    }
16}