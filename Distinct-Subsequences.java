1class Solution {
2    int[][] dp;
3    public int numDistinct(String s, String t) {
4        int n = s.length();
5        int m = t.length();
6
7        dp = new int[n][m];
8
9        for(int[] row: dp){
10            Arrays.fill(row,-1);
11        }
12
13        return solve(n-1,m-1,s,t);
14    }
15
16    private int solve(int i, int j, String s1,String s2){
17        if(j<0) return 1;
18        if(i<0) return 0;
19
20        if(dp[i][j] != -1) return dp[i][j];
21
22        if(s1.charAt(i) == s2.charAt(j)){
23            return dp[i][j] = solve(i-1,j-1,s1,s2)+solve(i-1,j,s1,s2);
24        }
25        
26        return dp[i][j] =solve(i-1,j,s1,s2);
27    }
28}