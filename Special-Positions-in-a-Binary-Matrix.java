1class Solution {
2    public int numSpecial(int[][] mat) {
3        int m = mat.length;
4        int n = mat[0].length;
5        int[] rowCount = new int[m];
6        int[] colCount = new int[n];
7
8        for(int row =0;row<m;row++){
9            for(int col =0;col <n;col++){
10                if(mat[row][col] ==1){
11                    rowCount[row]++;
12                    colCount[col]++;
13                }
14            }
15        }
16
17        int ans=0;
18
19        for(int row =0;row<m;row++){
20            for(int col =0;col <n;col++){
21                if(mat[row][col] ==1){
22                    if(rowCount[row] ==1 && colCount[col] ==1){
23                        ans++;
24                    }
25                }
26            }
27        }
28
29        return ans;
30    }
31}