1class Solution {
2    public int minPathSum(int[][] grid) {
3        int m = grid.length;
4        int n = grid[0].length;
5
6        int[] prev = new int[n];
7
8        for(int i=0;i<m;i++){
9            int[] curr = new int[n];
10
11            for(int j=0;j<n;j++){
12                if(i==0 && j ==0){
13
14                    curr[j] = grid[0][0];
15                    continue;
16                }
17
18                int up = Integer.MAX_VALUE;
19                int left = Integer.MAX_VALUE;
20
21                if(i>0) up= prev[j];
22
23                if(j>0) left = curr[j-1];
24
25                curr[j] =  grid[i][j]+Math.min(up,left);
26            }
27
28            prev = curr;
29        }
30
31        return prev[n-1];
32    }
33}