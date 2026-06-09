1class Solution {
2    public boolean isMatch(String s, String p) {
3        int n = s.length();
4        int m = p.length();
5
6        boolean[][] dp = new boolean[n+1][m+1];
7
8        dp[0][0] = true;
9
10        for(int j=2; j<=m; j++){
11            if(p.charAt(j-1) == '*'){
12                dp[0][j] = dp[0][j-2];
13            }
14        }
15
16        for(int i =1; i<=n; i++){
17            for(int j=1; j<= m ; j++){
18                if(s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '.'){
19                    dp[i][j] = dp[i-1][j-1];
20                }
21                else if(p.charAt(j-1) =='*'){
22                    dp[i][j] = dp[i][j-2];
23
24                    if(s.charAt(i-1) == p.charAt(j-2) || p.charAt(j-2) == '.'){
25                        dp[i][j] = dp[i][j] || dp[i-1][j];
26                    }
27                }
28            }
29        }
30
31        return dp[n][m];
32    }
33}