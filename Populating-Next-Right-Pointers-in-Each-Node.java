1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public Node left;
6    public Node right;
7    public Node next;
8
9    public Node() {}
10    
11    public Node(int _val) {
12        val = _val;
13    }
14
15    public Node(int _val, Node _left, Node _right, Node _next) {
16        val = _val;
17        left = _left;
18        right = _right;
19        next = _next;
20    }
21};
22*/
23
24class Solution {
25    public Node connect(Node root) {
26        if(root == null) return null;
27
28        Queue<Node> q = new LinkedList<>();
29        q.offer(root);
30
31        while(!q.isEmpty()){
32            Node rightNode = null;
33            for(int i=q.size();i>0;i--){
34                Node cur = q.poll();
35                cur.next = rightNode;
36                rightNode = cur;
37                if(cur.right != null){
38                    q.offer(cur.right);
39                    q.offer(cur.left);
40                }
41            }
42        }
43
44        return root;
45    }
46}