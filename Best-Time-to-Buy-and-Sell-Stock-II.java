1class Solution {
2    int[][] dp;
3
4    public int maxProfit(int[] prices) {
5        int n = prices.length;
6
7        dp = new int[n][2];
8
9        for(int[] row: dp){
10            Arrays.fill(row,-1);
11        }
12
13        return solve(0,1,prices);
14    }
15
16    private int solve(int i, int buy, int[] prices){
17        if(i == prices.length){
18            return 0;
19        }
20
21        if(dp[i][buy] != -1){
22            return dp[i][buy];
23        }
24
25        if(buy==1){
26            return dp[i][buy] = Math.max(-prices[i]+ solve(i+1,0,prices), solve(i+1,1,prices));
27        }
28
29        return dp[i][buy] = Math.max(prices[i]+solve(i+1,1,prices),solve(i+1,0,prices));
30
31    }
32}