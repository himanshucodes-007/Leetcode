1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode(int x) { val = x; }
8 * }
9 */
10
11class Solution {
12    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
13        if(root == null) return null;
14        int curr = root.val;
15        if(curr<p.val && curr < q.val){
16            return lowestCommonAncestor(root.right,p,q);
17        }
18        if(curr>p.val && curr>q.val){
19            return lowestCommonAncestor(root.left,p,q);
20        }
21
22        return root;
23    }
24}