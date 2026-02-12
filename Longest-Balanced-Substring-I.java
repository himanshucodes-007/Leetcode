1class Solution {
2
3    public boolean checkbalanced(int[] freq){
4        int common = 0;
5
6        for(int i=0;i<26;i++){
7            if(freq[i] == 0) continue;
8            if(common == 0){
9                common = freq[i];
10            }
11            else if(freq[i] != common){
12                return false;
13            }
14        }
15        return true;
16    }
17    public int longestBalanced(String s) {
18        int n = s.length();
19        int maxlen = 0;
20
21        for(int i =0;i<n;i++){
22            int[] freq = new int[26];
23            for(int j = i;j<n;j++){
24                freq[s.charAt(j)-'a']++;
25
26                if(checkbalanced(freq)){
27                    maxlen = Math.max(maxlen,j-i+1);
28                }
29                
30            }
31
32        }
33        return maxlen;
34    }
35}