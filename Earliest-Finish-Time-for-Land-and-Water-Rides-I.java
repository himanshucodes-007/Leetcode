1class Solution {
2    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
3        int n = landStartTime.length;
4        int m = waterStartTime.length;
5        int res = Integer.MAX_VALUE;
6        for (int i = 0; i < n; i++) {
7            for (int j = 0; j < m; j++) {
8                int land = landStartTime[i] + landDuration[i];
9                int land_water =
10                    Math.max(land, waterStartTime[j]) + waterDuration[j];
11                res = Math.min(res, land_water);
12
13                int water = waterStartTime[j] + waterDuration[j];
14                int water_land =
15                    Math.max(water, landStartTime[i]) + landDuration[i];
16                res = Math.min(res, water_land);
17            }
18        }
19        return res;
20    }
21}