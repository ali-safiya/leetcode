// Last updated: 03/03/2026, 02:04:10
1class Solution {
2    public int maxAreaOfIsland(int[][] grid) {
3
4        int m = grid.length;
5        int n = grid[0].length;
6
7        boolean[][] visited = new boolean[m][n];
8
9        int maxArea = 0;
10
11        for(int i=0;i<m;i++){
12            for(int j=0;j<n;j++){
13                if(grid[i][j] == 1 && !visited[i][j]){
14                    int area= traverse(grid,i,j,m,n,visited);
15                    maxArea = Math.max(maxArea, area);
16                }
17            }
18        }
19       return maxArea; 
20    }
21
22    private int traverse(int[][] grid , int x, int y, int m, int n, boolean[][] visited){
23
24        if(outOfBounds(x,y,m,n) || grid[x][y] ==0 || visited[x][y]) return 0;
25
26        visited[x][y] = true;
27
28        return 1+ traverse(grid,x+1,y,m,n,visited) +
29        traverse(grid,x-1,y,m,n,visited) +
30        traverse(grid,x,y+1,m,n,visited) +
31        traverse(grid,x,y-1,m,n,visited);
32 
33    }
34
35    private boolean outOfBounds(int x, int y, int m , int n){
36        return x < 0 || y < 0 || x >=m || y>= n;
37    }
38}