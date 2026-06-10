1class Solution {
2
3    public int maxProfit(int[] prices) {
4        int n = prices.length;
5
6        int[] ahead= new int[2];
7
8        for(int i= n-1; i>= 0; i--){
9
10            int[] curr = new int[2];
11
12            curr[1] = Math.max(-prices[i]+ahead[0], ahead[1]);
13
14            curr[0] = Math.max(prices[i]+ahead[1], ahead[0]);
15
16            ahead = curr;
17        }
18
19        return ahead[1];
20    }
21}