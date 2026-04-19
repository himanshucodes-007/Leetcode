1class Solution {
2    public int maxDistance(int[] nums1, int[] nums2) {
3        int maxdist = 0;
4        int i = 0;
5        int j=0;
6        while(i<nums1.length && j<nums2.length){
7            if(nums1[i]<= nums2[j]){
8                maxdist = Math.max(maxdist,j-i);
9                j++;
10            }
11            else{
12                i++;
13                j=i;
14            }
15        }
16        return maxdist;
17
18    }
19}