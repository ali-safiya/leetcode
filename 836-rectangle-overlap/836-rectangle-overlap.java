class Solution {
    public boolean isRectangleOverlap(int[] rect1, int[] rect2) {
        int ax1=rect1[0];
        int ay1=rect1[1];
        int ax2=rect1[2];
        int ay2=rect1[3];
        
        int bx1=rect2[0];
        int by1=rect2[1];
        int bx2=rect2[2];
        int by2=rect2[3];
        
        int y = Math.min(ay2,by2)-Math.max(ay1,by1);
        int x = Math.min(ax2,bx2)-Math.max(ax1,bx1);
        
        if(x>0 && y>0)
            return true;
        
        else
            return false;
        
        
    }
}