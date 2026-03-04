1class Solution {
2    public int numSpecial(int[][] mat) {
3        int count =0;
4        int m = mat.length;
5        int n = mat[0].length;
6        for(int i=0;i<m;i++){
7            for(int j =0;j<n;j++){
8                if(mat[i][j] ==1){
9                    if(isSpecial(i,j,mat)){
10                        count++;
11                    }
12                }
13            }
14        }
15
16        return count;
17    }
18
19    public boolean isSpecial(int i,int j,int[][] arr){
20        int m = arr.length;
21        int n = arr[0].length;
22        for(int a=0;a<m;a++){
23            if(arr[a][j] == 1 && a != i){
24                return false;
25            }
26        }
27        for(int b =0;b<n;b++){
28            if(arr[i][b] ==1 && b != j){
29                return false;
30            }
31        }
32
33        return true;
34    }
35}