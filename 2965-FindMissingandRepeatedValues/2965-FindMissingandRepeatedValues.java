class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int m = grid.length;
        long n = m*m;
        long sum = 0, squareSum =0;

        for(int i=0;i<m;++i){
            for(int j=0;j<m;++j){

                sum += grid[i][j];
                squareSum += (long) (grid[i][j]*grid[i][j]);
            }
        } 

        long sumDiff = sum - (n*(n+1))/2;
        long sqrDiff = squareSum -(n*(n+1)*(2*n+1))/6;
       
        int repeat = (int) (sqrDiff / sumDiff + sumDiff) / 2;
        int missing = (int) (sqrDiff / sumDiff - sumDiff) / 2;

        return new int[]{repeat,missing};
    }
}