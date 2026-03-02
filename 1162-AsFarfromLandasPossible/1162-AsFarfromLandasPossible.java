// Last updated: 03/03/2026, 03:54:54
1class Solution {
2    public int maxDistance(int[][] grid) {
3        int n = grid.length;
4        int[][] dirs = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
5        Queue<int[]> q = new ArrayDeque<>();
6        int land =0;
7        for(int i=0;i<n;i++){
8            for(int j=0;j<n;j++){
9                if(grid[i][j]==1){
10                    q.add(new int[]{i,j});
11                    land++;
12                }
13            }
14        }
15        if(land==0 || land == n*n) return -1;
16        int time=0;
17
18        while(!q.isEmpty()){
19            int size =q.size();
20
21            for(int i=0;i<size;i++){
22
23                int[] cur = q.poll();
24
25                for(int j=0;j<4;j++){
26                    int x= cur[0] + dirs[j][0];
27                    int y= cur[1] + dirs[j][1];
28                    if(x <0 || y< 0 || x>=n || y>= n || grid[x][y]==1) continue;
29
30                    grid[x][y]=1;
31                    q.add(new int[]{x,y});
32                }
33            }
34            time++;
35
36        }
37        return time-1;
38    }
39}