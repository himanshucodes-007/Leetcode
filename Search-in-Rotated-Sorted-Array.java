1class Solution {
2    public int search(int[] nums, int target) {
3        int low =0;
4        int high = nums.length-1;
5
6        while(low<=high){
7            int mid = (low+high)/2;
8
9            if(nums[mid] == target) return mid;
10
11            if(nums[low] <= nums[mid]){
12                if(nums[low] <= target && target < nums[mid]){
13                    high = mid-1;
14                }
15                else{
16                    low = mid+1;
17                }
18            }
19
20            else{
21                if(nums[mid]<target && target <= nums[high]){
22                    low = mid+1;
23                }
24                else{
25                    high = mid-1;
26                }
27            }
28            
29        }
30        return -1;
31    }
32}