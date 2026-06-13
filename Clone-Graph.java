1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public List<Node> neighbors;
6    public Node() {
7        val = 0;
8        neighbors = new ArrayList<Node>();
9    }
10    public Node(int _val) {
11        val = _val;
12        neighbors = new ArrayList<Node>();
13    }
14    public Node(int _val, ArrayList<Node> _neighbors) {
15        val = _val;
16        neighbors = _neighbors;
17    }
18}
19*/
20
21class Solution {
22    HashMap<Node, Node> map = new HashMap<>();
23    public Node cloneGraph(Node node) {
24        return dfs(node);
25    }
26
27    private Node dfs(Node node){
28        if(node == null) return null;
29
30        if(map.containsKey(node)) return map.get(node);
31
32        Node clone = new Node(node.val);
33
34        map.put(node,clone);
35
36        for(Node nbr: node.neighbors){
37            clone.neighbors.add(dfs(nbr));
38        }
39
40        return clone;
41    }
42}