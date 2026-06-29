1class Solution {
2
3    static class Node {
4
5        int row;
6        int col;
7        int effort;
8
9        Node(int row, int col, int effort) {
10            this.row = row;
11            this.col = col;
12            this.effort = effort;
13        }
14    }
15
16    public int minimumEffortPath(int[][] heights) {
17
18        int rows = heights.length;
19        int cols = heights[0].length;
20
21        int[][] effort = new int[rows][cols];
22
23        for (int[] row : effort) {
24            Arrays.fill(row, Integer.MAX_VALUE);
25        }
26
27        effort[0][0] = 0;
28
29        PriorityQueue<Node> pq =
30                new PriorityQueue<>(
31                    (a, b) -> a.effort - b.effort
32                );
33
34        pq.offer(new Node(0, 0, 0));
35
36        int[] dr = {-1, 0, 1, 0};
37        int[] dc = {0, 1, 0, -1};
38
39        while (!pq.isEmpty()) {
40
41            Node curr = pq.poll();
42
43            int r = curr.row;
44            int c = curr.col;
45            int currEffort = curr.effort;
46
47            if (r == rows - 1 && c == cols - 1) {
48                return currEffort;
49            }
50
51            if (currEffort > effort[r][c]) {
52                continue;
53            }
54
55            for (int k = 0; k < 4; k++) {
56
57                int nr = r + dr[k];
58                int nc = c + dc[k];
59
60                if (nr >= 0 &&
61                    nc >= 0 &&
62                    nr < rows &&
63                    nc < cols) {
64
65                    int diff = Math.abs(
66                        heights[nr][nc]
67                        - heights[r][c]
68                    );
69
70                    int newEffort = Math.max(
71                        currEffort,
72                        diff
73                    );
74
75                    if (newEffort < effort[nr][nc]) {
76
77                        effort[nr][nc] = newEffort;
78
79                        pq.offer(
80                            new Node(
81                                nr,
82                                nc,
83                                newEffort
84                            )
85                        );
86                    }
87                }
88            }
89        }
90
91        return 0;
92    }
93}