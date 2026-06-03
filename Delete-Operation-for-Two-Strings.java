1class Solution {
2
3    public int minDistance(String word1, String word2) {
4        int n = word1.length();
5        int m = word2.length();
6
7        int[] prev = new int[m+1];
8
9        for(int i=1; i<=n; i++){
10            int[] curr = new int[m+1];
11            for(int j = 1; j<=m ; j++){
12                if(word1.charAt(i-1) == word2.charAt(j-1)){
13                curr[j] = 1+prev[j-1];
14                }
15                else{
16                    curr[j] = Math.max(prev[j], curr[j-1]);
17                }
18            }
19            prev = curr;
20        }
21        return n+m- 2* prev[m];
22    }
23}