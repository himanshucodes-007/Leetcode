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
17    int maxvalue = Integer.MIN_VALUE;
18    public int maxPathSum(TreeNode root) {
19        
20        // int[] maxvalue= new int[1];
21        maxPathDown(root);
22        return maxvalue;
23    }
24
25    private int maxPathDown(TreeNode root){
26        if(root == null) return 0;
27
28        int left = Math.max(0,maxPathDown(root.left));
29        int right = Math.max(0,maxPathDown(root.right));
30
31        maxvalue = Math.max(maxvalue,left+right+root.val);
32        return Math.max(left,right)+root.val;
33    }
34}