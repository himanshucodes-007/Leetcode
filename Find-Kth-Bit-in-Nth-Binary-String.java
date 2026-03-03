1class Solution {
2    public char findKthBit(int n, int k) {
3        if(n ==1) return '0';
4        int len = 1 << n;
5
6        if(k<len /2){
7            return findKthBit(n-1,k);
8        }
9
10        else if(k == len/2){
11            return '1';
12        }
13
14        else{
15            char correspondingBit = findKthBit(n-1,len-k);
16            return (correspondingBit == '0') ? '1' : '0';
17        }
18    }
19}