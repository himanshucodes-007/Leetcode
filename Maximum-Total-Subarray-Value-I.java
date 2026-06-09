1class Solution {
2    public long maxTotalValue(int[] nums, int k) {
3        int m1 = Integer.MAX_VALUE;
4        int m2 = Integer.MIN_VALUE;
5
6        for(int i=0;i<nums.length;i++){
7            if(nums[i]>m2){
8                m2 = Math.max(m2,nums[i]);
9            }
10            if(nums[i] < m1){
11                m1 = Math.min(m1,nums[i]);
12            }
13        }
14
15        return (long)k*(m2-m1);
16    }
17}