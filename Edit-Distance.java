1class Solution {
2    int[][] dp;
3    public int minDistance(String word1, String word2) {
4        int n = word1.length();
5        int m = word2.length();
6
7        dp = new int[n][m];
8
9        for(int[] row: dp){
10            Arrays.fill(row,-1);
11        }
12
13        return solve(n-1,m-1,word1,word2);
14    }
15
16    private int solve(int i, int j, String s1, String s2){
17        if(i<0) return j+1;
18        if(j<0) return i+1;
19
20        if(s1.charAt(i) == s2.charAt(j)){
21            return solve(i-1,j-1,s1,s2);
22        }
23
24        if(dp[i][j] != -1){
25            return dp[i][j];
26        }
27
28
29        int insert = 1+solve(i,j-1,s1,s2);
30        int delete = 1+solve(i-1,j,s1,s2);
31        int replace = 1+solve(i-1,j-1,s1,s2);
32
33        return dp[i][j] = Math.min(insert, Math.min(delete, replace));
34    }
35}