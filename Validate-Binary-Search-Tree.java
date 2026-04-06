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
17    public boolean isValidBST(TreeNode root) {
18        ArrayList<Integer> inorder = new ArrayList<>();
19        helper(root,inorder);
20
21        for(int i=0;i<inorder.size()-1;i++){
22            if(inorder.get(i)>= inorder.get(i+1)){
23                return false;
24            }
25        }
26
27        return true;
28    }
29
30    public void helper(TreeNode root, ArrayList<Integer> inorder){
31        if(root == null) return;
32
33        helper(root.left,inorder);
34        inorder.add(root.val);
35        helper(root.right,inorder);
36
37    }
38}