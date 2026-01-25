1class Solution {
2    public int minimumDifference(int[] nums, int k) {
3        Arrays.sort(nums);
4
5        int n = nums.length;
6        int ans = Integer.MAX_VALUE;
7
8        for(int i=0;i+k-1<n;i++){
9            ans = Math.min(ans,nums[i+k-1]-nums[i]);
10        }
11
12        return ans;
13    }
14}