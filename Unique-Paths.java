1class Solution {
2    int dp[][];
3
4    public int uniquePaths(int m, int n) {
5        dp = new int[m][n];
6
7        for(int[] row:dp){
8            Arrays.fill(row,-1);
9        }
10        return solve(m-1,n-1);
11    }
12
13    public int solve(int i,int j){
14        if(i ==0 && j ==0){
15            return 1;
16        }
17
18        if(i<0 || j <0){
19            return 0;
20        }
21
22        if(dp[i][j] != -1){
23            return dp[i][j];
24        }
25
26        int up = solve(i-1,j);
27        int left = solve(i,j-1);
28
29        return dp[i][j] =up+left;
30    }
31}