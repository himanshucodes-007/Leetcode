1class Solution {
2    public boolean checkOnesSegment(String s) {
3        int n = s.length();
4        if(n==1) return true;
5
6        for(int i=0;i<n-1;i++){
7            if(s.charAt(i)=='0' && s.charAt(i+1) == '1'){
8                return false;
9            }
10        }
11        return true;
12    }
13}