1class Solution {
2    public int search(int[] nums, int target) {
3        int n = nums.length;
4        int low =0;
5        int high = n-1;
6
7        while(low <= high){
8
9            int mid = low+(high-low)/2;
10
11            if(nums[mid] == target) return mid;
12
13            if(nums[low] <= nums[mid]){
14                if(nums[low] <= target && target < nums[mid]){
15                    high = mid-1;
16                }
17                else{
18                    low= mid+1;
19                }
20            }
21
22            else{
23                if(nums[mid]<target && target <= nums[high]){
24                    low = mid+1;
25                }
26
27                else{
28                    high = mid-1;
29                }
30            }
31        }
32
33        return -1;
34    }
35}