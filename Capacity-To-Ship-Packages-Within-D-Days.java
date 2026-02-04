1class Solution {
2    public int shipWithinDays(int[] weights, int days) {
3        int sum = 0;
4        int maxw = Integer.MIN_VALUE;
5
6        for(int weight : weights){
7            sum += weight;
8            maxw = Math.max(maxw,weight);
9        }
10
11        int low = maxw;
12        int high = sum;
13        int ans = high;
14
15        while(low<= high){
16            int mid = (low+high)/2;
17
18            if(isPossible(mid,weights,days)){
19                ans = mid;
20                high = mid-1;
21            }
22            else{
23                low = mid+1;
24            }
25        }
26        return ans;
27    }
28
29    public boolean isPossible(int mid,int[] weights,int days){
30        int day =1;
31        int weightsum =0;
32        for(int i =0;i<weights.length;i++){
33            weightsum += weights[i];
34            if(weightsum >mid){
35                weightsum = weights[i];
36                day++;
37            }
38        }
39        if(day<=days) return true;
40        return false;
41    }
42}