1class Solution {
2    public int orangesRotting(int[][] grid) {
3        int rows = grid.length;
4        int cols = grid[0].length;
5
6        Queue<int[]> queue = new LinkedList<>();
7
8        int fresh =0;
9
10        for(int r=0;r<rows;r++){
11            for(int c = 0; c<cols; c++){
12                if(grid[r][c] ==2){
13                    queue.offer(new int[]{r,c});
14                }
15
16                else if(grid[r][c] == 1){
17                    fresh++;
18                }
19            }
20        }
21
22        if(fresh ==0) return 0;
23
24        int minutes =0;
25
26        int[] dr = {-1,0,1,0};
27        int[] dc = {0,1,0,-1};
28
29        while(!queue.isEmpty() && fresh>0){
30
31            int size = queue.size();
32            minutes++;
33
34            for(int i =0;i<size;i++){
35                int[] cell = queue.poll();
36
37                int r = cell[0];
38                int c = cell[1];
39
40                for(int k =0; k <4; k++){
41                    int nr = r+dr[k];
42                    int nc = c+dc[k];
43
44                    if(nr >= 0 && nc >= 0 && nr < rows && nc < cols && grid[nr][nc] == 1){
45                        grid[nr][nc] = 2;
46
47                        fresh--;
48
49                        queue.offer(new int[]{nr, nc});
50                    }
51                }
52            }
53            
54        }
55
56        return fresh == 0 ? minutes: -1;
57    }
58}