1class Solution {
2    public int minimumDeletions(String s) {
3        int res =0;
4        int count =0;
5
6        for(char c : s.toCharArray()){
7            if(c == 'b'){
8                count++;
9            }
10            else if(count != 0){
11                res++;
12                count--;
13            }
14        }
15        return res;
16    }
17}