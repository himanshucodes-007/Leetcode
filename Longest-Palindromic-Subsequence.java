1class Solution {
2    public int longestPalindromeSubseq(String s) {
3        String rev = new StringBuilder(s).reverse().toString();
4        int n = s.length();
5
6        int[][] dp = new int[n+1][n+1];
7        
8        for(int i=1; i<=n; i++){
9            for(int j = 1; j<=n; j++){
10                if(s.charAt(i-1) == rev.charAt(j-1)){
11                    dp[i][j] = 1+dp[i-1][j-1];
12                }
13                else{
14                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
15                }
16            }
17        }
18
19        return dp[n][n];
20    }
21}