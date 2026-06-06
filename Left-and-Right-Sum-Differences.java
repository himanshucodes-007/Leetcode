1class Solution {
2    public int[] leftRightDifference(int[] nums) {
3
4        int n= nums.length;
5        int[] ans = new int[n];
6
7
8        int left =0;
9        for(int i=0; i<n;i++){
10            ans[i] = left;
11            left += nums[i];
12        }
13
14        int right =0;
15        for(int i = n-1; i>=0; i--){
16            ans[i] = Math.abs(ans[i]-right);
17            right += nums[i];
18        }
19
20        return ans;
21    }
22}