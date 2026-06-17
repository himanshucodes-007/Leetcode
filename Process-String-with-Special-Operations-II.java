1class Solution {
2    public char processStr(String s, long k) {
3        long len = 0;
4        for (char c : s.toCharArray()) {
5            if (Character.isLowerCase(c)) len++;
6            else if (c == '*' && len > 0) len--;
7            else if (c == '#') len *= 2;
8        }
9        if (k >= len) return '.';
10
11        for (int i = s.length() - 1; i >= 0; i--) {
12            char c = s.charAt(i);
13            if (Character.isLowerCase(c)) {
14                if (k == len - 1) return c;
15                len--;
16            } else if (c == '*') {
17                len++;
18            } else if (c == '#') {
19                len /= 2;
20                if (k >= len) k -= len;
21            } else if (c == '%') {
22                k = len - 1 - k;
23            }
24        }
25        return '.';
26    }
27}