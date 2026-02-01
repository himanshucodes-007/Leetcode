1class Solution {
2    public int minimumCost(int[] nums) {
3        int first= Integer.MAX_VALUE;
4        int second = Integer.MAX_VALUE;
5
6        for(int i=1;i<nums.length;i++){
7            if(nums[i]<first){
8                second = first;
9                first = nums[i];
10            }
11            else if(nums[i]<second){
12                second = nums[i];
13            }
14        }
15        return nums[0]+first+second;
16    }
17}