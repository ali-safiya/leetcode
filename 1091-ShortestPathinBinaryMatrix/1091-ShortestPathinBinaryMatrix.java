// Last updated: 18/11/2026, 08:37:01
1class Solution {
2    public int shortestPathBinaryMatrix(int[][] grid) {
3
4        int m = grid.length;
5        int n = grid[0].length;
6
7        if (grid[0][0] == 1 || grid[m-1][n-1] == 1) {
8            return -1;
9        }
10
11        int[][] dir = new int[][]{{1,0},{0,1},{1,1},{-1,-1},{-1,0},{0,-1},{1,-1},{-1,1}}; 
12
13        boolean[][] visited = new boolean[m][n];
14
15        Queue<int[]> q = new LinkedList<>();
16
17        q.add(new int[]{0,0});
18        visited[0][0]= true;
19        int distance = 1;
20
21        while(!q.isEmpty()){
22
23            int size = q.size();
24
25            for(int i=0;i<size;i++){
26
27                int[] cur = q.poll();
28
29                int x = cur[0];
30                int y = cur[1];
31
32                if(x==m-1  && y == n-1) return distance;
33
34                for(int j=0;j<8;j++){
35                    x = cur[0] + dir[j][0];
36                    y = cur[1] + dir[j][1];
37
38                    if(x >= m || x <0 || y >= n || y < 0 || visited[x][y] || grid[x][y] !=0)
39                        continue;
40
41                    q.add(new int[]{x,y});
42                    visited[x][y] = true;
43                }
44            }
45            distance++;
46        }
47
48        return -1;
49    }
50}