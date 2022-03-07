class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
       int[][] reshape = new int[r][c];
        int row=mat.length;
        int col=mat[0].length;
        int m=0;
        int n=0;
        if(row*col!=r*c)
            return mat;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++){
                reshape[i][j]=mat[m][n++];
                if(n==col)
                {
                    n=0;
                    m++;
                }
            }
        }
        return reshape;
    }
}