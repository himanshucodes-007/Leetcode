1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public int rob(TreeNode root) {
18        int[] ans = solve(root);
19
20        return Math.max(ans[0],ans[1]);
21    }
22
23    private int[] solve(TreeNode root){
24        if(root == null){
25            return new int[]{0,0};
26        }
27
28        int[] left = solve(root.left);
29        int[] right = solve(root.right);
30
31        int rob = root.val+left[1]+right[1];
32
33        int notRob = Math.max(left[0], left[1])+Math.max(right[0],right[1]);
34
35        return new int[]{ rob, notRob};
36    }
37}