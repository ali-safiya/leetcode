// Last updated: 31/07/2026, 20:18:39
1class Solution {
2    public int findCircleNum(int[][] isConnected) {
3        
4        int n = isConnected.length;
5        int[] size = new int[n];
6        int[] parent = new int[n];
7        int noOfComp =n;
8
9        for(int i=0;i<n;i++){
10            size[i]=1;
11            parent[i]=i;
12        }
13
14        for(int i=0;i<n;i++){
15            for(int j=i+1;j<n;j++){
16                if(isConnected[i][j]==1 && union(i,j,size,parent)){
17                    noOfComp--;
18                }
19            }
20        }
21        return noOfComp;
22    }
23
24    private boolean union(int i , int j,int[] size, int[] parent){
25
26        int x = find(i,parent);
27        int y = find(j,parent);
28
29        if(x==y) return false;
30
31        if(size[x] < size[y]){
32            parent[x] = y;
33            size[y] += size[x];
34        }else{
35            parent[y] = x;
36            size[x] += size[y];
37        }
38        return true;
39    }
40
41    private int find(int x, int[] parent){
42
43        if(parent[x]!=x){
44            parent[x]=find(parent[x],parent);
45        }
46        return parent[x];
47    }
48
49
50}