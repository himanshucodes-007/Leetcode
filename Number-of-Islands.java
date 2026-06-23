1class Solution {
2    public int numIslands(char[][] grid) {
3        int rows = grid.length;
4        int cols = grid[0].length;
5
6        int islands = 0;
7
8        for(int r=0; r< rows; r++){
9            for(int c=0; c<cols; c++){
10                if(grid[r][c] == '1'){
11                    islands++;
12
13                    dfs(r,c,grid);
14                }
15            }
16        }
17
18        return islands;
19    }
20
21    private void dfs(int r, int c, char[][] grid){
22        int rows = grid.length;
23        int cols = grid[0].length;
24
25        if(r<0 || c <0 || r>= rows || c>= cols || grid[r][c] == '0'){
26            return ;
27        }
28
29        grid[r][c] = '0';
30        dfs(r-1,c,grid);
31        dfs(r+1,c,grid);
32        dfs(r,c-1,grid);
33        dfs(r,c+1,grid);
34    }
35}