// Last updated: 02/03/2026, 02:15:10
1class Solution {
2    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
3
4        int m = image.length;
5        int n = image[0].length;
6        int orgColor = image[sr][sc];
7        if (orgColor == color) return image;
8        color(image,sr,sc,color,m,n,orgColor);
9        return image;
10    }
11
12    private void color(int[][] img, int x, int y, int color , int m, int n, int orgColor){
13
14        if(x>=m || y >= n || x<0 || y <0) return;
15
16        if(img[x][y] != orgColor) return;
17
18        img[x][y] = color;
19 
20        color(img,x,y+1,color,m,n,orgColor);
21       
22        color(img,x,y-1,color,m,n,orgColor);
23       
24        color(img,x+1,y,color,m,n,orgColor);
25       
26        color(img,x-1,y,color,m,n,orgColor);
27    }
28}