1class Solution {
2    public String shortestCommonSupersequence(String str1, String str2) {
3        int n = str1.length();
4        int m = str2.length();
5
6        int[][] dp = new int[n+1][m+1];
7
8        for(int i=1;i<=n; i++){
9            for(int j=1; j<=m; j++){
10
11                if(str1.charAt(i-1) == str2.charAt(j-1)){
12                    dp[i][j] = 1+dp[i-1][j-1];
13                }
14
15                else{
16                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
17                }
18            }
19        }
20
21        StringBuilder ans = new StringBuilder();
22
23        int i =n, j= m;
24
25        while(i>0 && j >0){
26            if(str1.charAt(i-1) == str2.charAt(j-1)){
27                ans.append(str1.charAt(i-1));
28                i--;
29                j--;
30            }
31
32            else if(dp[i-1][j]>dp[i][j-1]){
33                ans.append(str1.charAt(i-1));
34                i--;
35            }
36
37            else{
38                ans.append(str2.charAt(j-1));
39                j--;
40            }
41        }
42
43        while(i>0){
44            ans.append(str1.charAt(i-1));
45            i--;
46        }
47
48        while(j>0){
49            ans.append(str2.charAt(j-1));
50            j--;
51        }
52
53        return ans.reverse().toString();
54    }
55}