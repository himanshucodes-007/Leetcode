1class Solution {
2    public int numSteps(String s) {
3        int steps =0;
4        int carry =0;
5
6        for(int i = s.length()-1;i>0;i--){
7            int bit = s.charAt(i) - '0';
8
9            if(bit + carry ==1){
10                // odd
11                steps +=2;
12                carry =1;
13            }
14            else{
15                //even
16                steps+=1;
17            }
18        }
19
20        return steps+carry;
21
22    }
23}