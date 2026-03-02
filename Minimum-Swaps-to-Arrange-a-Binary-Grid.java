1class Solution {
2    public int minSwaps(int[][] grid) {
3        int n = grid.length;
4
5        int[] endZeros = new int[n];
6
7        for(int i=0;i<n;i++){
8            int j = n-1;
9
10
11            int count =0;
12            while(j>=0 && grid[i][j] == 0){
13                count++;
14                j--;
15            }
16
17            endZeros[i] = count;
18        }
19
20        int steps =0;
21
22        for(int i=0;i<n;i++){
23            int need = n-1-i;
24
25            int j =i;
26
27            while(j<n && endZeros[j] < need){
28                j++;
29            }
30
31            if(j == n){
32                return -1;
33            }
34
35            steps +=(j-i);
36
37            while(j>i){
38                int temp = endZeros[j];
39                endZeros[j] = endZeros[j-1];
40                endZeros[j-1] = temp;
41                j--;
42            }
43        }
44
45        return steps;
46    }
47}  