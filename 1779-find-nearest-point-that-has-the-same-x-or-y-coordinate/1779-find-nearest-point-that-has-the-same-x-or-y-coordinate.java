class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        
        int distance =0;
        int min=Integer.MAX_VALUE;
        int index=0;
        int valid_point=0;
        
        for( int i=0;i<points.length;i++){
            
            if(x== points[i][0] || y==points[i][1]){
                valid_point++;
                
                distance=Math.abs(x-points[i][0]) + Math.abs(y-points[i][1]);
                
                if(min>distance){
                    min=distance;
                    index=i;
                }
            }
        }
        if(valid_point==0)
            return -1;
        return index;
        
    }
}