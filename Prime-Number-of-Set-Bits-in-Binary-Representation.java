1class Solution {
2    public boolean isPrime(int n){
3        if (n <= 1) return false;
4
5        for (int i = 2; i < n; i++) {
6            if (n % i == 0)
7                return false;
8        }
9        return true;
10    }
11
12    public int bitCount(int n){
13        int count =0;
14
15        while (n != 0) {
16            n = n & (n - 1);
17            count++;
18        }
19        return count;
20    }
21
22    public int countPrimeSetBits(int left, int right) {
23        int cnt =0;
24
25        for(int i=left;i<= right;i++){
26            if(isPrime(bitCount(i))){
27                cnt++;
28            }
29        }
30        return cnt;
31    }
32}