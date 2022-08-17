class Solution {
    public boolean checkValid(int[][] matrix) {
        
        int n = matrix.length;
        
        int totalSum = (n*(n+1))/2;
        
        for(int i=0;i<n;i++){
            HashSet<Integer> rows = new HashSet<Integer>();
            HashSet<Integer> cols = new HashSet<Integer>();
            
            for(int j=0;j<n;j++){
                
                if(!rows.add(matrix[i][j])) return false;
                if(!cols.add(matrix[j][i])) return false;
            }
         
        }
        
        return true;
        
    }
}