1class Solution {
2    public void nextPermutation(int[] nums) {
3        int i = nums.length-2;
4
5        while(i>= 0 && nums[i+1] <= nums[i]){
6            i--;
7        }
8
9        if(i >= 0){
10            int j = nums.length -1;
11            while(nums[j] <= nums[i]){
12                j--;
13            }
14
15            swap(nums,i,j);
16        }
17
18        reverse(nums, i+1);
19    }
20
21    private void reverse(int[] nums, int start){
22        int i = start, j= nums.length-1;
23
24        while(i<j){
25            swap(nums,i,j);
26            i++;
27            j--;
28        }
29    }
30
31    private void swap(int[] nums, int i , int j){
32        int temp = nums[i];
33        nums[i] = nums[j];
34        nums[j] = temp;
35    }
36}