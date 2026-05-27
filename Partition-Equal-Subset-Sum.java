1class Solution {
2    public boolean canPartition(int[] nums) {
3        int sum =0;
4
5        for(int num: nums){
6            sum += num;
7        }
8
9        if(sum%2 !=0) return false;
10
11        int target = sum/2;
12
13        int n = nums.length;
14
15        boolean[] prev= new boolean[target+1];
16
17        //target 0
18        prev[0] = true;
19
20        //first element
21
22        if(nums[0] <= target){
23            prev[nums[0]] = true;
24        }
25
26        for(int i=1; i<n;i++){
27
28            boolean[] curr = new boolean[target+1];
29
30            curr[0] = true;
31
32            for(int j =1;j<= target;j++){
33                boolean notTake = prev[j];
34                boolean take = false;
35
36                if(nums[i] <= j){
37                    take = prev[j-nums[i]];
38                }
39
40                curr[j] = take||notTake;
41            }
42
43            prev = curr;
44        }
45
46        return prev[target];
47    }
48}