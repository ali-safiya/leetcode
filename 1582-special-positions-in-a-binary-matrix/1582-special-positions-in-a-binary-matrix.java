class Solution {
    public int numSpecial(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        int temp=Math.max(row,col);
        
        int[][] cal= new int[temp][2];
       
        
        int count=0;
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                
                if(matrix[i][j]==1){
                    cal[i][0]++;
                    cal[j][1]++;
                }
            }
        }
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==1 && cal[i][0]==1 && cal[j][1]==1)
                    count++;
            }
        }
        
        return count;
    }
}