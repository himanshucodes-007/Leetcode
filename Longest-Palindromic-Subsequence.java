1class Solution {
2    int[][] dp;
3    public int longestPalindromeSubseq(String s) {
4        String rev = new StringBuilder(s).reverse().toString();
5        int n = s.length();
6
7        dp = new int[n][n];
8        for(int[] row: dp){
9            Arrays.fill(row,-1);
10        }
11
12        return solve(n-1,n-1,s,rev);
13    }
14
15    public int solve(int i , int j , String s1, String s2){
16        if(i< 0 || j < 0) return 0;
17
18        if(dp[i][j] != -1) return dp[i][j];
19
20        if(s1.charAt(i) == s2.charAt(j)){
21            return 1+solve(i-1,j-1,s1,s2);
22        }
23
24        return dp[i][j] = Math.max(solve(i-1,j,s1,s2),solve(i,j-1,s1,s2));
25    }
26}