1class Solution {
2
3    public int maxProfit(int[] prices) {
4
5        int n = prices.length;
6
7        int[][][] dp = new int[n + 1][2][3];
8
9        for (int i = n - 1; i >= 0; i--) {
10
11            for (int buy = 0; buy <= 1; buy++) {
12
13                for (int cap = 1; cap <= 2; cap++) {
14
15                    if (buy == 1) {
16
17                        dp[i][buy][cap] = Math.max(
18                            -prices[i] + dp[i + 1][0][cap],
19                            dp[i + 1][1][cap]
20                        );
21
22                    } else {
23
24                        dp[i][buy][cap] = Math.max(
25                            prices[i] + dp[i + 1][1][cap - 1],
26                            dp[i + 1][0][cap]
27                        );
28                    }
29                }
30            }
31        }
32
33        return dp[0][1][2];
34    }
35}