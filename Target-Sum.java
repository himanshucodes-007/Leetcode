1class Solution {
2    public int findTargetSumWays(int[] nums, int target) {
3        int totalSum =0;
4
5        for(int num: nums){
6            totalSum += num;
7        }
8
9        if(totalSum < Math.abs(target) || (totalSum+target)%2 != 0 ){
10            return 0;
11        }
12
13        int tar = (totalSum+target)/2;
14
15        int n = nums.length;
16
17        int[][] dp = new int[n][tar+1];
18
19        //base case
20        if(nums[0] == 0){
21            dp[0][0] = 2;
22        }
23
24        else{
25            dp[0][0] = 1;
26        }
27
28        if(nums[0] != 0 && nums[0] <= tar){
29            dp[0][nums[0]] =1;
30        }
31
32        for(int i=1;i<n;i++){
33            for(int t=0;t<= tar;t++){
34
35                int notTake = dp[i-1][t];
36
37                int take =0;
38
39                if(nums[i] <= t){
40                    take = dp[i-1][t-nums[i]];
41                }
42
43                dp[i][t] = take+notTake;
44            }
45        }
46
47        return dp[n-1][tar];
48    }
49}