1class Solution {
2    public List<Integer> eventualSafeNodes(int[][] graph) {
3        int n = graph.length;
4
5        ArrayList<ArrayList<Integer>> rev = new ArrayList<>();
6
7        for(int i=0; i<n; i++){
8            rev.add(new ArrayList<>());
9        }
10
11        int[] indegree = new int[n];
12
13        for(int i=0;i<n;i++){
14            indegree[i] = graph[i].length;
15
16            for(int nbr: graph[i]){
17                rev.get(nbr).add(i);
18            }
19        }
20
21        Queue<Integer> queue = new LinkedList<>();
22
23        for(int i=0; i<n;i++){
24            if(indegree[i] == 0) queue.offer(i);
25        }
26
27        List<Integer> ans = new ArrayList<>();
28
29        while(!queue.isEmpty()){
30            int node = queue.poll();
31
32            ans.add(node);
33
34            for(int nbr: rev.get(node)){
35                indegree[nbr]--;
36
37                if(indegree[nbr] == 0){
38                    queue.offer(nbr);
39                }
40            }
41        }
42        Collections.sort(ans);
43
44        return ans;
45    }
46}