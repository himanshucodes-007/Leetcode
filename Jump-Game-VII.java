1class Solution {
2    public boolean canReach(String s, int minJump, int maxJump) {
3        int n = s.length();
4
5        int[] t = new int[n];
6        //t[i] > 0 : possible to reach i
7        // == 0 : not possible to reach i
8
9        t[0] = 1;
10        int count = 0;
11
12        for (int j = 1; j <= n - 1; j++) {
13            if (j - minJump >= 0) {
14                count += t[j - minJump];
15            }
16
17            if (j - maxJump - 1 >= 0) {
18                count -= t[j - maxJump - 1];
19            }
20
21            if (count > 0 && s.charAt(j) == '0') {
22                t[j] = 1;
23            }
24        }
25
26        return t[n - 1] > 0;
27    }
28}