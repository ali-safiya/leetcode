// Last updated: 04/08/2026, 20:00:06
1class Solution {
2    public int maximumMinutes(int[][] grid) {
3
4        int row = grid.length;
5        int col = grid[0].length;
6        Queue<int[]> q = new LinkedList<>();
7        int[][] fireTime = new int[row][col];
8        int[][] dir = new int[][]{{0,1},{1,0},{-1,0},{0,-1}};
9
10
11
12        for(int i=0;i<row;i++){
13            for(int j=0;j<col;j++){
14                if(grid[i][j]== 1){
15                    q.add(new int[]{i,j});
16                    fireTime[i][j]=0;
17                }
18                else{
19                    fireTime[i][j] = Integer.MAX_VALUE;
20                }
21            }
22        }
23
24        int t = 1;
25        while(!q.isEmpty()){
26
27            int size = q.size();
28
29            while(size-- > 0){
30
31                int[] cur = q.poll();
32
33                for(int i=0;i<dir.length;i++){
34
35                    int x = cur[0] + dir[i][0];
36                    int y = cur[1] + dir[i][1];
37
38                    if(x <0 || y<0 || x>=row || y>= col || grid[x][y] == 2 || fireTime[x][y]!=Integer.MAX_VALUE)
39                        continue;
40
41                    fireTime[x][y] =t;
42                    q.add(new int[]{x,y});
43                }
44            }
45            t++;
46        }
47
48        int low = 0 ;
49        int high = 1_000_000_000;
50
51        if(pathExists(fireTime,1_000_000_000,grid,row,col,dir))
52            return 1_000_000_000;
53
54        int ans=-1;
55        while(low<=high){
56
57            int mid = low +(high-low)/2;
58
59            if(pathExists(fireTime, mid,grid,row,col,dir)){
60                ans = mid;
61                low = mid+1;
62            }
63            else{
64                high=mid-1;
65            }
66        }
67        return ans;
68    }
69
70    private boolean pathExists(int[][] fireTime, int t, int[][] grid,int row, int col,int[][] dir){
71
72        if(fireTime[0][0] <= t) return false;
73
74       Queue<int[]> q = new LinkedList<>();
75       boolean[] visited = new boolean[row*col];
76
77       q.add(new int[]{0,0});
78       visited[0] = true;
79
80       while(!q.isEmpty()){
81
82            int size = q.size();
83
84            while(size-- > 0){
85
86                int[] cur = q.poll();
87                if((cur[0] == row-1 && cur[1]==col-1) && fireTime[cur[0]][cur[1]] >=t+1)
88                    return true;
89
90                for(int i=0;i<dir.length;i++){
91
92                    int x = cur[0] + dir[i][0];
93                    int y = cur[1] + dir[i][1];
94
95                    if (x == row - 1 && y == col - 1) {
96                        return fireTime[x][y] >= t + 1;
97                    }
98
99                    if(x <0 || y<0 || x>=row || y>= col || grid[x][y] == 2 || fireTime[x][y] <= t+1 || visited[col*x + y])
100                        continue;
101                    
102                    visited[col*x+y]=true;
103                    q.add(new int[]{x,y});
104                }
105            }
106            t++;
107        }
108        return false;
109    }
110}