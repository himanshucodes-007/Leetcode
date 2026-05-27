1class Solution {
2    public int numberOfSpecialChars(String word) {
3
4        int[] lastLower = new int[26];
5        int[] firstUpper = new int[26];
6
7        // initialize
8        Arrays.fill(lastLower, -1);
9        Arrays.fill(firstUpper, -1);
10
11        for(int i = 0; i < word.length(); i++) {
12
13            char ch = word.charAt(i);
14
15            if(Character.isLowerCase(ch)) {
16                lastLower[ch - 'a'] = i;
17            }
18            else {
19                if(firstUpper[ch-'A'] == -1){
20                    firstUpper[ch-'A'] = i;
21                }
22            }
23        }
24
25        int count = 0;
26
27        for(int i = 0; i < 26; i++) {
28
29            if(lastLower[i] != -1 &&
30               firstUpper[i] != -1 &&
31               lastLower[i] < firstUpper[i]) {
32
33                count++;
34            }
35        }
36
37        return count;
38    }
39}