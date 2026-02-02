1class Solution {
2    public int minEatingSpeed(int[] piles, int h) {
3
4        int maxele = 0;
5        for (int x : piles) {
6            maxele = Math.max(maxele, x);
7        }
8
9        int l = 1, r = maxele;
10        int ans = maxele;
11
12        while (l <= r) {
13            int mid = l + (r - l) / 2;
14            long totalhrs = 0;
15
16            for (int x : piles) {
17                totalhrs += (x + mid - 1L) / mid; // force long math
18            }
19
20            if (totalhrs <= h) {
21                ans = mid;
22                r = mid - 1;
23            } else {
24                l = mid + 1;
25            }
26        }
27        return ans;
28    }
29}
30