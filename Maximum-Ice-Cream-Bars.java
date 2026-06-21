1class Solution {
2    public int maxIceCream(int[] costs, int coins) {
3        int ans =0;
4        Arrays.sort(costs);
5        for(int i:costs){
6            if(i<=coins){
7                ans++;
8                coins -= i;
9            }
10        }
11
12        return ans;
13    }
14}