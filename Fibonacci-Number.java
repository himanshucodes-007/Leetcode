1class Solution {
2    public int fib(int n) {
3        if(n==0){
4            return 0;
5        }
6        else if(n==1){
7            return 1;
8        }
9        else{
10            return fib(n-1)+fib(n-2);
11        }
12    }
13}