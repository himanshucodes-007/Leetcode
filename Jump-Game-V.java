1class Solution {
2
3    int[] dp;
4    public int maxJumps(int[] arr, int d) {
5
6        int n= arr.length;
7        dp = new int[n];
8        int ans =1;
9        for(int i=0;i<arr.length;i++){
10            ans = Math.max(ans,solve(i,arr,d));
11        }
12
13        return ans;
14    }
15
16    public int solve(int i,int[] arr,int d){
17
18        if(dp[i] != 0){
19            return dp[i];
20        }
21        int ans =1;
22
23        //left
24
25        for(int j=i-1;j>=Math.max(0,i-d);j--){
26            if(arr[j] >= arr[i]) break;
27
28            ans = Math.max(ans,1+solve(j,arr,d));
29        }
30
31        //Right
32
33        for(int j=i+1;j<= Math.min(arr.length-1,i+d);j++){
34            if(arr[j] >=arr[i]) break;
35
36            ans = Math.max(ans,1+solve(j,arr,d));
37        }
38
39        return dp[i]=ans;
40    }
41}