1class Solution {
2    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
3        int m = obstacleGrid.length;
4        int n = obstacleGrid[0].length;
5
6        int[] prev = new int[n];
7
8        for(int i =0;i<m;i++){
9
10            int[] curr = new int[n];
11
12            for(int j=0;j<n;j++){
13                if(obstacleGrid[i][j] ==1){
14                    curr[j] =0;
15                    continue;
16                }
17
18                if(i ==0 && j ==0){
19                    curr[j] =1;
20                    continue;
21                }
22
23                int up =0;
24                int left =0;
25
26                if(i>0) up = prev[j];
27
28                if(j>0) left= curr[j-1];
29
30                curr[j] = up+left;
31
32                
33            }
34            prev = curr;
35        }
36
37        return prev[n-1];
38    }
39}