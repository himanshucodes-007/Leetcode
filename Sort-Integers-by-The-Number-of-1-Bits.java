1class Solution {
2    public int[] sortByBits(int[] arr) {
3        int n = arr.length;
4
5        Integer[] sorted = new Integer[arr.length];
6        for(int i=0;i<n;i++){
7            sorted[i] = arr[i];
8        }
9        
10        Arrays.sort(sorted,(a,b)->{
11            int countA = countOneBits(a);
12            int countB = countOneBits(b);
13
14            if(countA == countB){
15                return a.compareTo(b);
16            }
17
18            return Integer.compare(countA,countB);
19        });
20
21        for(int i=0;i<n;i++){
22            arr[i] = sorted[i];
23        }
24
25        return arr;
26    }
27
28    public int countOneBits(int num){
29        int count =0;
30
31        while(num>0){
32            if((num&1) == 1) count++;
33            num = num>>1;
34        }
35
36        return count;
37    }
38}