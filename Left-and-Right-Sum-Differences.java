1class Solution {
2    public int[] leftRightDifference(int[] nums) {
3        int n = nums.length;
4        int[] ans = new int[n];
5
6        if(n==1) return ans;
7
8        int[] leftarr = new int[n];
9        for(int i=0;i<n;i++){
10            if(i==0){
11                leftarr[i] =0;
12            }
13            else{
14                leftarr[i] = leftarr[i-1]+nums[i-1]; 
15            }
16        }
17
18        int[] rightarr = new int[n];
19
20        for(int i=n-1; i>=0; i--){
21            if(i==n-1){
22                rightarr[i] = 0;
23            }
24            else{
25                rightarr[i] = rightarr[i+1]+nums[i+1];
26            }
27        }
28
29        for(int i=0;i<n;i++){
30            ans[i] = Math.abs(leftarr[i]-rightarr[i]);
31        }
32
33        return ans;
34    }
35}