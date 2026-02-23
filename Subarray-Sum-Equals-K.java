1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        Map<Integer,Integer> map = new HashMap<>();
4        map.put(0,1);
5
6        int sum =0;
7        int count =0;
8
9        for(int num:nums){
10            sum += num;
11
12            if(map.containsKey(sum-k)){
13                count += map.get(sum-k);
14            }
15
16            map.put(sum,map.getOrDefault(sum,0)+1);
17        }
18
19        return count;
20    }
21}