1class Solution {
2    int[][] dp;
3    public int longestCommonSubsequence(String text1, String text2) {
4        int n = text1.length();
5        int m = text2.length();
6
7        dp = new int[n][m];
8
9        for(int[] row: dp) Arrays.fill(row, -1);
10
11        return solve(n-1, m-1, text1, text2);
12    }
13
14    private int solve(int i, int j, String s1, String s2){
15        if(i<0 || j<0) return 0;
16
17        if(dp[i][j] != -1) return dp[i][j];
18
19        if(s1.charAt(i) == s2.charAt(j)){
20            return 1+ solve(i-1, j-1, s1, s2);
21        }
22
23        return dp[i][j] = Math.max(solve(i-1, j, s1, s2), solve(i, j-1, s1, s2));
24    }
25}