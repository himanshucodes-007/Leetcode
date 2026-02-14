1class Solution {
2    public double champagneTower(int poured, int query_row, int query_glass) {
3        double[][] t = new double[101][101];
4
5        t[0][0] = (double) poured;
6
7        for(int row =0;row<=query_row; row++){
8            for(int col =0;col <= row;col++){
9                double extra = (t[row][col]-1)/2.0;
10
11                if(extra > 0){
12                    t[row+1][col] += extra;
13                    t[row+1][col+1] += extra;
14                }
15            }
16        }
17
18        return Math.min(t[query_row][query_glass],1.0);
19    }
20}