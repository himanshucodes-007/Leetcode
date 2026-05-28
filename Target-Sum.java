1class Solution {
2    public int findTargetSumWays(int[] nums, int target) {
3        int totalSum =0;
4
5        for(int num : nums) totalSum += num;
6
7        if(totalSum < Math.abs(target) || (totalSum + target)% 2  != 0) return 0;
8
9        int tar = (totalSum + target) /2;
10
11        int[] prev = new int[tar+1];
12
13        prev[0]= (nums[0] == 0) ? 2:1;
14
15        if(nums[0] != 0 && nums[0] <= tar) prev[nums[0]] =1;
16
17        for(int i =1; i <nums.length;i++){
18            int[] curr = new int[tar+1];
19
20            for(int t =0; t <= tar; t++){
21                int notTake= prev[t];
22
23                int take = 0;
24
25                if(nums[i] <= t) take = prev[t - nums[i]];
26                curr[t] = take+notTake;
27            }
28
29            prev = curr;
30        }
31
32        return prev[tar];
33    }
34}