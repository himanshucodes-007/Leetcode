1class Solution {
2    public int furthestDistanceFromOrigin(String moves) {
3        int start1 =0;
4        int start2 =0;
5
6        for(char c:moves.toCharArray()){
7            if(c =='R'){
8                start1 += 1;
9                start2 += 1;
10            }
11            else if(c == 'L'){
12                start1 -= 1;
13                start2 -= 1;
14            }
15            else{
16                start1 -= 1;
17                start2 += 1;
18            }
19        }
20        return Math.max(Math.abs(start1),Math.abs(start2));
21
22
23    }
24}