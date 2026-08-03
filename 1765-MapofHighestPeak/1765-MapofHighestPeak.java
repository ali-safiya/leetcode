// Last updated: 03/08/2026, 20:06:55
1class Solution {
2    public int shortestBridge(int[][] grid) {
3
4        int n = grid.length;
5        boolean[] visited = new boolean[n*n];
6        int[][] dir = new int[][]{{0,1},{1,0},{-1,0},{0,-1}};
7
8        Queue<int[]> q = new LinkedList<>();
9
10        for(int i=0;i<n;i++){
11            boolean stop=false;
12            for(int j=0;j<n;j++){
13                if(grid[i][j] == 1){
14                    DFS(grid,i,j,visited,n,q);
15                    stop = true;
16                    break;
17                }
18            }
19            if(stop) break;
20        }
21        int flips =0 ;
22        while(!q.isEmpty()){
23
24            int size =q.size();
25
26            while(size-- > 0){
27
28                int[] cur = q.poll();
29
30                for(int i=0;i<dir.length;i++){
31
32                    int x = cur[0] + dir[i][0];
33                    int y = cur[1] + dir[i][1];
34
35                    if(x < 0 || y< 0 || x>=n || y>=n || visited[x*n+y])
36                        continue;
37                    
38                    if(grid[x][y] == 1) return flips;
39                    
40                    q.add(new int[]{x,y});
41                    visited[x*n+y] = true;
42                }
43
44            }
45            flips++;
46        }
47        return -1;
48    }
49
50    void DFS(int[][] grid , int x , int y, boolean[] visited, int n,Queue<int[]> q){
51
52        if(x < 0 || y< 0 || x>=n || y>=n || grid[x][y]== 0 || visited[x*n+y])
53            return;
54
55        q.add(new int[]{x,y});
56        visited[x*n+y] = true; 
57        DFS(grid,x+1,y,visited,n,q);
58        DFS(grid,x-1,y,visited,n,q);
59        DFS(grid,x,y+1,visited,n,q);
60        DFS(grid,x,y-1,visited,n,q);
61    }
62}