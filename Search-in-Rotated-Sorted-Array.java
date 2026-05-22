1class Solution {
2    public int search(int[] nums, int target) {
3        int n = nums.length;
4        int lo = 0, hi = n-1;
5
6        while(lo<hi){
7            int mid = (lo+hi)/2;
8
9            if(nums[mid] > nums[n-1]) lo= mid+1;
10            else hi = mid;
11        }
12
13        int rot = lo;
14
15        lo=0; hi = n-1;
16
17        while(lo <= hi){
18            int mid = (lo+hi)/2;
19            int real = (mid+rot)%n;
20
21            if(nums[real] == target) return real;
22
23            if(nums[real] < target) lo = mid+1;
24            else hi = mid-1;
25        }
26
27        return -1;
28    }
29}