class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int row=mat.length;
        int col=mat[0].length;
        int[] noOfSoldiers= new int[row];
        
        int[] result =new int[k];
        
        for(int i=0;i<row;i++){
            int count=0;
            for(int j=0;j<col;j++){
                if(mat[i][j]==1)
                    count++;
                else
                break;
            }
          noOfSoldiers[i]=count;  
        }
       
        int m=0;
        for(int i=0;i<k;i++)
        {
            int index=row;
            int min=Integer.MAX_VALUE-1;
            
            for(int j=0;j<row;j++){
             
                if(noOfSoldiers[j]<min){
                 min=noOfSoldiers[j];
                  index=j;   
             } 
                if(noOfSoldiers[j]==min){
               
                  index=Math.min(j,index);
                   
                }
            }
            

            noOfSoldiers[index]=Integer.MAX_VALUE;
            
            result[m++]=index;
        }
        return result;
    }
}