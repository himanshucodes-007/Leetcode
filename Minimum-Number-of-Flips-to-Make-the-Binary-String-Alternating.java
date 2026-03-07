1class Solution {
2    public int minFlips(String s) {
3        int n = s.length();
4        
5        int result = Integer.MAX_VALUE;
6        int flip1 =0;
7        int flip2 =0;
8
9        int i =0;
10        int j=0;
11
12        while(j<2*n){
13            char expectedCharS1 = (j%2 == 1) ? '1' : '0';
14            char expectedCharS2 = (j%2 == 1) ? '0' : '1';
15
16            if(s.charAt(j%n) != expectedCharS1) flip1++;
17            if(s.charAt(j%n) != expectedCharS2) flip2++;
18
19            if(j-i+1>n){
20                expectedCharS1 = (i%2 == 1) ? '1' : '0';
21                expectedCharS2 = (i%2 == 1) ? '0' : '1';
22
23                if(s.charAt(i%n) != expectedCharS1) flip1--;
24                if(s.charAt(i%n) != expectedCharS2) flip2--;
25
26                i++;
27
28            }
29
30            if(j-i+1 == n){
31                result = Math.min(result,Math.min(flip1,flip2));
32            }
33
34            j++;
35        }
36        return result;        
37    }
38}