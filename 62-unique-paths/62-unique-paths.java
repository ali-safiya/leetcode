class Solution {
    public int uniquePaths(int m, int n) {
        
        int max = Math.max(m,n);
        int min=  Math.min(m,n);
        
        long noOfPaths = 1;
        
        for(int i= max ;i<(max+min-1) ;i++  ){
            
            noOfPaths*=i;
            noOfPaths/=(i-max+1);
        }

        return (int)noOfPaths;
        
        
        
    }
    
   
}