1class Solution {
2    public int minPathSum(int[][] grid) {
3        int m = grid.length;
4        int n = grid[0].length;
5
6        int[][] dp = new int[m][n];
7
8        dp[0][0] = grid[0][0];
9
10        for(int i =0;i<m;i++){
11            for(int j=0;j<n;j++){
12                if(i==0 && j ==0) continue;
13
14                int up = Integer.MAX_VALUE;
15                int left = Integer.MAX_VALUE;
16
17                if(i>0) up = dp[i-1][j];
18
19                if(j>0) left = dp[i][j-1];
20
21                dp[i][j] = grid[i][j] + Math.min(up,left);
22            }
23        }
24
25        return dp[m-1][n-1];
26    }
27}