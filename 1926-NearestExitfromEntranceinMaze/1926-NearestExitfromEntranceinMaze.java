// Last updated: 02/08/2026, 21:05:50
1class Solution {
2    public int nearestExit(char[][] maze, int[] entrance) {
3
4        int row = maze.length;
5        int col = maze[0].length;
6
7        int[][] dir = new int[][]{{0,1},{-1,0},{1,0},{0,-1}};
8        Queue<int[]> q = new LinkedList<>();
9        boolean[] visited = new boolean[row*col];
10
11        q.add(entrance);
12        visited[entrance[0]*col + entrance[1]]=true;
13        int len=1;
14
15        while(!q.isEmpty()){
16
17            int size = q.size();
18
19            for(int i=0;i<size;i++){
20                
21                int[] cur = q.poll();
22
23                for(int j=0;j<dir.length;j++){
24
25                    int x = cur[0] + dir[j][0];
26                    int y = cur[1] + dir[j][1]; 
27
28                    if(x < 0 || y< 0 || x >= row || y >=col || maze[x][y] == '+'|| visited[x*col + y])
29                        continue;
30                    
31                    if((x == 0 || y==0 || x==row-1 || y ==col-1) && maze[x][y] == '.' && !(x==entrance[0] && y==entrance[1])) return len;
32                    
33                    visited[x*col + y] = true;
34                    q.add(new int[]{x,y});
35                }
36
37            }
38            len++;
39
40        }
41        return -1;
42    }
43}