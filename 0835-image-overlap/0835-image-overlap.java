class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        
        int maxOverlap =0;
        int n =img1.length;
        
        for(int i=0; i< n ;i++){
            
            for( int j=0 ;j< n ;j++){
                
                maxOverlap = Math.max( maxOverlap , count(i,j,img1,img2));
                
                maxOverlap = Math.max(maxOverlap , count(i,j,img2,img1));
            }
        }
        
        return maxOverlap;
        
    }
    
    int count(int shiftX, int shiftY , int[][] A , int[][] B){
        
        int leftcount=0;
        int rightcount=0;
        int row=0;
        
        for(int i= shiftY ;i< A.length;i++){
            
            int col=0;
            
            for(int j= shiftX ;j<A.length;j++){
                
                if(A[i][j] ==1 && A[i][j] == B[row][col])
                    leftcount++;
                 if(A[i][col] ==1 && A[i][col] == B[row][j])
                    rightcount++;
                
                col++;
                
            }
            row++;
        }
        return Math.max(leftcount,rightcount);
    }
    
}