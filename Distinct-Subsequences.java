1class Solution {
2    public int numDistinct(String s, String t) {
3        int n = s.length();
4        int m = t.length();
5
6        int[] dp = new int[m+1];
7
8        dp[0] =1;
9
10        for(int i=1; i<=n; i++){
11            for(int j=m; j>=1;j--){
12                if(s.charAt(i-1) == t.charAt(j-1)){
13                    dp[j] = dp[j-1]+dp[j];
14                }
15            }
16        }
17
18        return dp[m];
19    }
20}