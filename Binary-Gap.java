1class Solution {
2    public int binaryGap(int n) {
3        int maxdist =0;
4        int dist =-1;
5
6        while(n>0){
7            if((n&1) ==1){
8                if(dist != -1){
9                    maxdist = Math.max(dist,maxdist);
10                }
11                dist =0;
12            }
13            if(dist != -1){
14                dist++;
15            }
16            n >>= 1;
17        }
18
19        return maxdist;
20    }
21}