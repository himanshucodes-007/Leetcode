1class Solution {
2    public int minDistance(String word1, String word2) {
3        int n = word1.length();
4        int m = word2.length();
5
6        int[][] dp = new int[n+1][m+1];
7
8        for(int i=0; i<=n; i++) dp[i][0] = i;
9        for(int j=0; j<=m; j++) dp[0][j] = j;
10
11        for(int i=1; i<=n; i++){
12            for(int j=1; j<=m; j++){
13                if(word1.charAt(i-1) == word2.charAt(j-1)){
14                    dp[i][j] = dp[i-1][j-1];
15                }
16
17                else{
18                    int insert = dp[i][j-1];
19                    int delete = dp[i-1][j];
20                    int replace = dp[i-1][j-1];
21
22                    dp[i][j] = 1+Math.min(insert,Math.min(delete,replace));
23                }
24            }
25        }
26
27        return dp[n][m];
28    }
29}