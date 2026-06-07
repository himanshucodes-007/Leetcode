1class Solution {
2    public int numDistinct(String s, String t) {
3        int n = s.length();
4        int m = t.length();
5
6        int[][] dp = new int[n+1][m+1];
7
8        for(int i=0; i<=n;i++){
9            dp[i][0] =1;
10        }
11
12        for(int i=1; i<=n; i++){
13            for(int j=1; j<=m;j++){
14                if(s.charAt(i-1) == t.charAt(j-1)){
15                    dp[i][j] = dp[i-1][j-1]+dp[i-1][j];
16                }
17                else{
18                    dp[i][j] = dp[i-1][j];
19                }
20            }
21        }
22
23        return dp[n][m];
24    }
25}