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
17    public int minDepth(TreeNode root) {
18        if(root == null) return 0;
19
20        int left = minDepth(root.left);
21        int right = minDepth(root.right);
22
23        if(left == 0) return 1+right;
24        if(right == 0) return 1+left;
25
26        return 1+ Math.min(left,right);
27    }
28}