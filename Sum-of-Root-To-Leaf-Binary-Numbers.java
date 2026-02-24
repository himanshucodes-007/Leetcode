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
17    public int sumRootToLeaf(TreeNode root) {
18        return dfs(root,0);
19    }
20
21    public int dfs(TreeNode node , int current){
22        if(node == null) return 0;
23
24        current = current*2 + node.val;
25
26        if(node.left == null && node.right == null){
27            return current;
28        }
29
30        return dfs(node.left,current)+dfs(node.right,current);
31    }
32}