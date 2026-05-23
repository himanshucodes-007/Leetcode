1class Solution {
2
3    public int minPathSum(int[][] grid) {
4        int m= grid.length;
5        int n= grid[0].length;
6
7        int[][] dp = new int[m][n];
8
9        dp[0][0] = grid[0][0];
10
11        for(int i=0;i<m;i++){
12            for(int j=0;j<n;j++){
13                if(i ==0 && j==0) continue;
14
15                int up = Integer.MAX_VALUE;
16                int left = Integer.MAX_VALUE;
17
18                if(i>0){
19                    up = dp[i-1][j];
20                }
21
22                if(j>0){
23                    left = dp[i][j-1];
24                }
25
26                dp[i][j] = grid[i][j]+Math.min(up,left);
27            }
28        }
29
30        return dp[m-1][n-1];
31    }
32
33}