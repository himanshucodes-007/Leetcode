1class Solution {
2    public int coinChange(int[] coins, int amount) {
3        int[] dp = new int[amount+1];
4
5        Arrays.fill(dp, amount+1);
6        dp[0] =0;
7
8        for(int coin : coins){
9            for(int target = coin; target <= amount; target++){
10                dp[target] = Math.min(dp[target], 1+dp[target-coin]);
11            }
12        }
13
14        return dp[amount] > amount ? -1: dp[amount];
15    }
16}