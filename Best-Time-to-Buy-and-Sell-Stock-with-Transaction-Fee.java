1class Solution {
2    int[][] dp;
3    public int maxProfit(int[] prices, int fee) {
4        int n = prices.length;
5
6        dp = new int[n][2];
7
8        for(int[] row: dp){
9            Arrays.fill(row,-1);
10        }
11
12        return solve(0,1,prices,fee);
13    }
14
15    private int solve(int i, int buy, int[] prices, int fee){
16        if(i== prices.length) return 0;
17
18        if(dp[i][buy] != -1){
19            return dp[i][buy];
20        }
21
22        if(buy ==1){
23            return dp[i][buy] = Math.max(-prices[i] + solve(i+1,0,prices,fee), solve(i+1,1,prices,fee));
24        }
25
26        return dp[i][buy] = Math.max(prices[i]- fee + solve(i+1,1,prices,fee), solve(i+1,0,prices,fee));
27
28    }
29}