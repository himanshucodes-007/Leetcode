1class Solution {
2    public boolean findRotation(int[][] mat, int[][] target) {
3        int n = mat.length;
4        //4 rotations
5        for(int k =0;k<4;k++){
6            for(int i=0;i<n/2;i++){
7                for(int j=0;j<(n+1)/2;j++){
8                    int temp = mat[i][j];
9                    mat[i][j] = mat[n-1-j][i];
10                    mat[n-1-j][i] = mat[n-1-i][n-1-j];
11                    mat[n-1-i][n-1-j] = mat[j][n-1-i];
12                    mat[j][n-1-i] = temp;
13                }
14            }
15
16            if(isEqual(mat,target)){
17                return true;
18            }
19        }
20
21        return false;
22    }
23
24    private boolean isEqual(int[][] mat,int[][] target){
25        int n= mat.length;
26        for(int i=0;i<n;i++){
27            for(int j=0;j<n;j++){
28                if(mat[i][j] != target[i][j]){
29                    return false;
30                }
31            }
32        }
33
34        return true;
35    }
36}
37