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
17    HashSet<Integer> set = new HashSet<>();
18
19    public boolean findTarget(TreeNode root, int k) {
20        if(root == null) return false;
21
22        if(set.contains(k-root.val)) return true;
23
24        set.add(root.val);
25
26        return findTarget(root.left,k) || findTarget(root.right,k);
27    }
28}