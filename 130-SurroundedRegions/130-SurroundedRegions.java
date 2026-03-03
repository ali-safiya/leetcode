// Last updated: 04/03/2026, 03:27:24
1class Solution {
2    int[][] dir = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
3    public void solve(char[][] board) {
4        int m = board.length;
5        int n= board[0].length;
6
7        for(int i=0;i<n;i++){
8            if(board[0][i] == 'O') dfs(board,0,i,m,n);
9            if(board[m-1][i] == 'O') dfs(board,m-1,i,m,n); 
10        }
11        for(int i=1;i<m-1;i++){
12            if(board[i][0] == 'O') dfs(board,i,0,m,n);
13            if(board[i][n-1] == 'O') dfs(board,i,n-1,m,n); 
14        }
15
16        for(int i=0;i<m;i++){
17            for(int j=0;j<n;j++){
18                if(board[i][j] == 'O') board[i][j] ='X';
19                if(board[i][j] == '#') board[i][j] ='O';
20                
21            }
22        }
23
24    }
25
26    private void dfs(char[][] board, int x, int y, int m, int n){
27
28        if(x < 0 || y< 0 || x>=m || y>= n || board[x][y] !='O') return;
29
30        board[x][y] ='#';
31
32        for(int i=0;i<4;i++){
33            dfs(board, x+ dir[i][0],y+dir[i][1],m,n);
34        }
35    }
36}