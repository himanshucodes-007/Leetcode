1class Solution {
2
3    public int uniquePaths(int m, int n) {
4
5        int[] prev = new int[n];
6
7        for(int i = 0; i < m; i++){
8
9            int[] curr = new int[n];
10
11            for(int j = 0; j < n; j++){
12
13                if(i == 0 && j == 0){
14                    curr[j] = 1;
15                    continue;
16                }
17
18                int up = 0;
19                int left = 0;
20
21                if(i > 0){
22                    up = prev[j];
23                }
24
25                if(j > 0){
26                    left = curr[j-1];
27                }
28
29                curr[j] = up + left;
30            }
31
32            prev = curr;
33        }
34
35        return prev[n-1];
36    }
37}