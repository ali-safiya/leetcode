class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        
        
      int n=mat.length;
      boolean check1=true,check2=true,check3=true,check4=true;
        
      for(int i=0;i<n;i++){
          for(int j=0;j<n;j++){
              
              if(mat[i][j]!=target[n-1-j][i])
                  check1=false;
              
              if(mat[i][j]!=target[n-1-i][n-1-j])
                  check2=false;
              
              if(mat[i][j]!=target[j][n-i-1])
                  check3=false;
              
              if(mat[i][j]!=target[i][j])
                  check4=false;
          }
      }
        
      return check1 || check2 || check3 || check4;  
    }
}