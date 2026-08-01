// Last updated: 01/08/2026, 19:57:51
1class Solution {
2    public int shortestPathBinaryMatrix(int[][] grid) {
3
4        int n = grid.length;
5        Queue<int[]> q = new LinkedList<>();
6        boolean[] visited = new boolean[n*n];
7
8        int[][] dir = new int[][]{{0,1},{1,0},{-1,0},{0,-1},{1,1},{-1,-1},{-1,1},{1,-1}};
9
10        if(grid[0][0] == 1 || grid[n-1][n-1] == 1)
11            return -1;
12        if(n == 1)
13            return 1;
14        if(grid[0][0]==0){
15            q.add(new int[]{0,0,1});
16            visited[0] = true;
17        }
18
19        while(!q.isEmpty()){
20
21            int size = q.size();
22
23            for(int i=0;i<size;i++){
24
25                int[] p = q.poll();
26
27                for(int j=0;j<dir.length;j++){
28
29                    int px = p[0] + dir[j][0];
30                    int py = p[1] + dir[j][1];
31
32                    if(px < 0 || py < 0 || px >= n || py >= n || grid[px][py] == 1 || visited[px*n + py]) 
33                        continue;
34                    
35                    if(px==n-1 && py ==n-1) return p[2]+1;
36                    
37                    q.add(new int[]{px,py,p[2]+1});
38                    visited[px*n + py] = true;
39                }
40            }
41        }
42        return -1;
43    }
44}