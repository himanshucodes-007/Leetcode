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
13        int newTarget = (totalSum+target)/2;
14
15        return solve(nums.length-1,newTarget,nums);
16    }
17
18    public int solve(int i, int target,int[] nums){
19        if(i==0){
20            if(target ==0 && nums[0] == 0){
21                return 2;
22            }
23
24            if(target ==0 || target == nums[0]){
25                return 1;
26            }
27
28            return 0;
29        }
30        int notTake = solve(i-1,target,nums);
31        int take =0;
32
33        if(nums[i] <= target){
34
35            take = solve(i-1,target-nums[i],nums);
36        }
37
38
39        return take+notTake;
40    }
41}