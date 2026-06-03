1class Solution {
2    public int longestPalindromeSubseq(String s) {
3        String rev = new StringBuilder(s).reverse().toString();
4        int n = s.length();
5
6        int[] prev = new int[n+1];
7        
8        for(int i=1; i<=n; i++){
9            int[] curr = new int[n+1];
10            for(int j = 1; j<=n; j++){
11                if(s.charAt(i-1) == rev.charAt(j-1)){
12                    curr[j] = 1+prev[j-1];
13                }
14                else{
15                    curr[j] = Math.max(prev[j], curr[j-1]);
16                }
17            }
18            prev = curr;
19        }
20
21        return prev[n];
22    }
23}