1class Solution {
2    public int numberOfSpecialChars(String word) {
3        HashSet<Character> set = new HashSet<>();
4
5        for(char c : word.toCharArray()){
6            set.add(c);
7        }
8
9        int ans =0;
10        for(char c = 'a'; c <= 'z'; c++){
11            if(set.contains(c) && set.contains((char) (c-'a'+'A'))){
12                ans++;
13            }
14        }
15
16        return ans;
17    }
18}