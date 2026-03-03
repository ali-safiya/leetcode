// Last updated: 04/03/2026, 03:12:50
1class Solution {
2    int[][] dir = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
3    public int numEnclaves(int[][] grid) {
4        int m = grid.length;
5        int n = grid[0].length;
6
7        for(int i =0;i<n;i++){
8            if(grid[0][i] == 1) dfs(grid,0,i,m,n);
9            if(grid[m-1][i] == 1) dfs(grid,m-1,i,m,n);
10        }
11        for(int i =1;i<m-1;i++){
12            if(grid[i][0] == 1) dfs(grid,i,0,m,n);
13            if(grid[i][n-1] == 1) dfs(grid,i,n-1,m,n);
14        }
15
16        int noOfLands=0;
17        for(int i=0;i<m;i++){
18            for(int j=0;j<n;j++){
19                if(grid[i][j]==1){
20                    noOfLands++;
21                }
22            }
23        }
24        return noOfLands;
25    }
26
27    private void dfs(int[][] grid , int x, int y, int m , int n){
28
29        if(x < 0 || y<0 || x>= m || y>= n || grid[x][y]==0){
30            return;
31        }
32        grid[x][y]=0;
33        for(int i=0;i<4;i++){
34            dfs(grid , x+dir[i][0] ,y+dir[i][1],m,n);
35        }
36    }
37}