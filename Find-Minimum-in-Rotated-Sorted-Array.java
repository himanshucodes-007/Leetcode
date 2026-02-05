1class Solution {
2    public int findMin(int[] nums) {
3        int n = nums.length;
4        int low = 0;
5        int high = n-1;
6
7        while(low<high){
8            int mid = low+(high-low)/2;
9            if(nums[high] < nums[mid]){
10                low = mid+1;
11            }
12            else{
13                high = mid;
14            }
15        }
16        return nums[low];
17    }
18}