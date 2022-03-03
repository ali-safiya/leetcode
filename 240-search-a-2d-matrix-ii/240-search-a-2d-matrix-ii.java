class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0;
        int n=matrix[0].length;
        int j=0;
        int m=matrix.length;
        
        while(j<m)
        {
            i=0;
            while(i<n)
            {
               
                if(target>matrix[j][i])
                    i++;
                else if(target==matrix[j][i])
                    return true;
                 else  
                {
                    i=0;
                    break;
                }
                
            }
            j++;
        }
        return false;
    }
}