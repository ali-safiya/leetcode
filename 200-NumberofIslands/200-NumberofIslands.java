// Last updated: 03/03/2026, 01:49:52
1class Solution {
2    public int numIslands(char[][] grid) {
3
4        int m = grid.length;
5        int n = grid[0].length;
6
7        boolean[][] visited = new boolean[m][n];
8        int noOfIsland =0;
9
10        for(int i=0;i<m;i++){
11            for(int j=0;j<n;j++){
12
13                if(grid[i][j] == '1' && !visited[i][j]){
14                    traverse(grid,i,j,m,n,visited);
15                    noOfIsland++;
16
17                }
18            }
19        }
20        return noOfIsland;
21    }
22
23    private void traverse(char[][] grid, int x, int y , int m, int n, boolean[][] visited){
24
25        if(outOfBounds(x,y,m,n) || visited[x][y] || grid[x][y]== '0') return;
26
27        visited[x][y]=true;
28
29        traverse(grid,x+1,y,m,n,visited);
30        traverse(grid,x-1,y,m,n,visited);
31        traverse(grid,x,y+1,m,n,visited);
32        traverse(grid,x,y-1,m,n,visited);
33    }
34
35    private boolean outOfBounds(int x, int y, int m , int n){
36
37        if(x<0 || y < 0 || x >= m || y >= n) return true;
38
39        return false;
40    }
41}