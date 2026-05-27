1class Solution {
2    public boolean canPartition(int[] nums) {
3        int sum =0;
4
5        for(int num: nums){
6            sum += num;
7        }
8
9        if(sum%2 !=0) return false;
10
11        int target = sum/2;
12
13        int n = nums.length;
14
15        boolean[][] dp = new boolean[n][target+1];
16
17        //target 0
18        for(int i=0;i<n;i++){
19            dp[i][0] = true;
20        }
21
22        //first element
23
24        if(nums[0] <= target){
25            dp[0][nums[0]] = true;
26        }
27
28        for(int i=1; i<n;i++){
29            for(int j =1;j<= target;j++){
30                boolean notTake = dp[i-1][j];
31                boolean take = false;
32
33                if(nums[i] <= j){
34                    take = dp[i-1][j-nums[i]];
35                }
36
37                dp[i][j] = take||notTake;
38            }
39        }
40
41        return dp[n-1][target];
42    }
43}