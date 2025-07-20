// Last updated: 20/07/2025, 22:45:59
class Solution {
    public void setZeroes(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        boolean isFirstRowZero = false;
        boolean isFirstColZero = false;

        for(int i=0;i<m;i++){
            if(matrix[i][0]== 0) isFirstColZero=true;
        }
        for(int i=0;i<n;i++){
            if(matrix[0][i]== 0) isFirstRowZero=true;
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }

        
        for(int i=1;i<m;i++){
            if(matrix[i][0]==0){
                for(int j=1;j<n;j++){
                    matrix[i][j]=0;
                }
            }
        }

        for(int j=1;j<n;j++){
            if(matrix[0][j]==0){
                for(int i=1;i<m;i++){
                    matrix[i][j]=0;
                }
            }
        }

        if(isFirstColZero){
            for(int i=0;i<m;i++){
                matrix[i][0]= 0;
            }
        }
         
        if(isFirstRowZero){
            for(int i=0;i<n;i++){
                matrix[0][i]= 0;
            }
        }
    }
}