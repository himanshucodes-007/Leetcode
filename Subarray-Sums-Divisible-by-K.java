1class Solution {
2    public int subarraysDivByK(int[] nums, int k) {
3        Map<Integer,Integer> map = new HashMap<>();
4        map.put(0,1);
5
6        int sum =0;
7        int count =0;
8
9        for(int num:nums){
10            sum += num;
11
12            int rem = sum%k;
13
14            if(rem<0) rem += k;
15
16            if(map.containsKey(rem)){
17                count += map.get(rem);
18            }
19
20            map.put(rem,map.getOrDefault(rem,0)+1);
21        }
22
23        return count;
24    }
25}