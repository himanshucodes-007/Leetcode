1class Solution {
2    public boolean canFinish(int numCourses, int[][] prerequisites) {
3        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
4
5        for(int i=0;i<numCourses;i++){
6            adj.add(new ArrayList<>());
7        }
8
9        int[] indegree = new int[numCourses];
10
11        for(int[] edge: prerequisites){
12            int course= edge[0];
13            int prereq = edge[1];
14
15            adj.get(prereq).add(course);
16
17            indegree[course]++;
18        }
19
20        Queue<Integer> q = new LinkedList<>();
21
22        for(int i=0;i<numCourses; i++){
23            if(indegree[i] == 0){
24                q.offer(i);
25            }
26        }
27
28        int count =0;
29
30        while(!q.isEmpty()){
31            int node = q.poll();
32
33            count++;
34
35            for(int nbr: adj.get(node)){
36                indegree[nbr]--;
37
38                if(indegree[nbr] == 0){
39                    q.offer(nbr);
40                }
41            }
42        }
43
44        return count == numCourses;
45    }
46}