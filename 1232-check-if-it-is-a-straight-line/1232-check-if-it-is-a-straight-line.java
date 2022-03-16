class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        
        int Xdiff=coordinates[1][0]-coordinates[0][0];
        int Ydiff=coordinates[1][1]-coordinates[0][1];
        
        
        
        for(int i=1;i<coordinates.length-1;i++){
            int xdiff=coordinates[i+1][0]-coordinates[i][0];
            int ydiff=coordinates[i+1][1]-coordinates[i][1];
            
            
            if(Xdiff * ydiff !=  Ydiff * xdiff)
                return false;
            
            
        }
        return true;
    }
}