1class Solution {
2
3    public int minimumDeletions(String s) {
4        int n = s.length();
5        Stack<Character> charStack = new Stack<>();
6        int deleteCount = 0;
7        for (int i = 0; i < n; i++) {
8            if (
9                !charStack.isEmpty() &&
10                charStack.peek() == 'b' &&
11                s.charAt(i) == 'a'
12            ) {
13                charStack.pop();
14                deleteCount++;
15            } else {
16                charStack.push(s.charAt(i));
17            }
18        }
19
20        return deleteCount;
21    }
22}