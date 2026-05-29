1class Solution {
2    public int coinChange(int[] coins, int amount) {
3        int n = coins.length;
4
5        int[][] dp = new int[n][amount+1];
6        
7        for(int t =0; t <= amount; t++){
8            if(t% coins[0] ==0){
9                dp[0][t] = t/coins[0];
10            }
11            else{
12                dp[0][t] = Integer.MAX_VALUE;
13            }
14        }
15
16        for(int i =1; i<n; i++){
17            for(int target =0; target <= amount; target++){
18
19                int notTake = dp[i-1][target];
20
21                int take = Integer.MAX_VALUE;
22                if (coins[i] <= target) {
23                    int res = dp[i][target - coins[i]];
24
25                    if (res != Integer.MAX_VALUE) {
26                        take = 1 + res;
27                    }
28                }
29
30                dp[i][target] = Math.min(take,notTake);
31
32            }
33        }
34
35        int ans = dp[n-1][amount];
36        return ans >= Integer.MAX_VALUE ? -1 : ans;
37    }
38}