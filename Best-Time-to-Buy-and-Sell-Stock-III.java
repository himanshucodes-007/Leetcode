1class Solution {
2    int[][][] dp;
3    public int maxProfit(int[] prices) {
4        int n = prices.length;
5
6        dp= new int[n][2][3];
7
8        for(int[][] mat: dp){
9            for(int[] row: mat){
10                Arrays.fill(row,-1);
11            }
12        }
13
14        return solve(0,1,2,prices);
15    }
16
17    private int solve(int i, int buy, int cap, int[] prices){
18
19        if(i == prices.length || cap == 0){
20            return 0;
21        }
22
23        if(dp[i][buy][cap] != -1){
24            return dp[i][buy][cap];
25        }
26
27        if(buy ==1){
28            return dp[i][buy][cap] =  Math.max(-prices[i]+solve(i+1,0,cap,prices), solve(i+1,1,cap,prices));
29        }
30
31        return dp[i][buy][cap] = Math.max(prices[i]+solve(i+1,1,cap-1,prices), solve(i+1,0,cap,prices));
32    }
33}