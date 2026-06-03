1class Solution {
2    public int longestCommonSubsequence(String text1, String text2) {
3        int n = text1.length();
4        int m = text2.length();
5
6        int[] prev = new int[m+1];
7
8        for(int i=1; i <= n; i++){
9
10            int[] curr = new int[m+1];
11
12            for(int j=1;j<=m; j++){
13                if(text1.charAt(i-1) == text2.charAt(j-1)){
14                    curr[j] = 1+ prev[j-1];
15                }
16                else{
17                    curr[j] = Math.max(prev[j], curr[j-1]);
18                }
19            }
20
21            prev = curr;
22        }
23
24        return prev[m];
25    }
26}