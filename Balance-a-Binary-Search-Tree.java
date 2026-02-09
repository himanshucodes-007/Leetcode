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
17
18    private void inorder(TreeNode root, List<Integer> vec){
19        if(root == null){
20            return;
21        }
22        inorder(root.left,vec);
23        vec.add(root.val);
24        inorder(root.right,vec);
25    }
26
27    private TreeNode construct(int l,int r,List<Integer> vec){
28        if(l>r){
29            return null;
30        }
31        int mid = l+(r-l)/2;
32        TreeNode root = new TreeNode(vec.get(mid));
33        root.left = construct(l,mid-1,vec);
34        root.right = construct(mid+1,r,vec);
35        return root;
36    }
37
38    public TreeNode balanceBST(TreeNode root) {
39        List<Integer> vec = new ArrayList<>();
40        inorder(root,vec);
41        return construct(0,vec.size()-1,vec);
42    }
43}