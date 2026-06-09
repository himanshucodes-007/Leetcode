1class Solution {
2    int[][] dp;
3    public boolean isMatch(String s, String p) {
4        int n = s.length();
5        int m = p.length();
6
7        dp = new int[n][m];
8
9        for(int[] row: dp){
10            Arrays.fill(row,-1);
11        }
12
13        return solve(n-1,m-1,s,p);
14    }
15
16    private boolean solve(int i, int j, String s1, String s2){
17        if(i<0 && j <0){
18            return true;
19        }
20
21        if(j<0){
22            return false;
23        }
24
25        if(i<0){
26            for(int k=j; k>=0;k-=2){
27                if(s2.charAt(k) !='*'){
28                    return false;
29                }
30            }
31
32            return true;
33        }
34
35        if(dp[i][j] != -1){
36            return dp[i][j] == 1;
37        }
38
39        boolean ans;
40
41        if(s1.charAt(i) == s2 .charAt(j) || s2.charAt(j) == '.'){
42            ans = solve(i-1,j-1,s1,s2);
43        }
44
45        else if(s2.charAt(j) == '*'){
46            boolean notTake = solve(i,j-2,s1,s2);
47            boolean take = false;
48
49            if(s1.charAt(i) == s2 .charAt(j-1) || s2.charAt(j-1) == '.'){
50                take = solve(i-1,j,s1,s2);
51            }
52
53            ans = take || notTake;
54        }
55        else{
56            ans = false;
57        }
58
59        dp[i][j] = ans ? 1: 0;
60
61        return ans;
62    }
63}