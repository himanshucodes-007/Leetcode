1class Solution {
2    public int numOfStrings(String[] patterns, String word) {
3        int n = patterns.length;
4        int count =0;
5        for(int i=0;i<n;i++){
6            if(word.contains(patterns[i])){
7                count++;
8            }
9        }
10        return count;
11    }
12}