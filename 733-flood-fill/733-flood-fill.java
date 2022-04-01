class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
       
        int color= image[sr][sc];
        if(color!=newColor)
            solve(image,sr,sc,color,newColor);
        return image;
    }
    
    void solve(int[][] image, int sr, int sc,int color,int newColor){
        
        if(image[sr][sc]==color){
            
            image[sr][sc]=newColor;
            
            if(sr>=1) solve(image,sr-1,sc,color,newColor);
            if(sr+1<image.length) solve(image,sr+1,sc,color,newColor);
            
             if(sc+1<image[0].length) solve(image,sr,sc+1,color,newColor);
             if(sc>=1) solve(image,sr,sc-1,color,newColor);
        }
    }
}