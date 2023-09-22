class Solution {
    public List<Integer> getRow(int rowIndex) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        int[][] dp = new int[rowIndex+1][rowIndex+1];

        for(int i=0;i<=rowIndex;i++){
            Arrays.fill(dp[i],-1);
        }
        for(int i= 0 ; i <= rowIndex; i++){
            list.add(generate(rowIndex,i,dp));
        }
        return list;
    }

    int generate(int r, int c,int[][] dp){

        if(c == 0 || c== r ){
            return 1;
        }
        if(dp[r][c]!=-1)
            return dp[r][c];

        dp[r][c]=generate(r-1,c-1,dp)+generate(r-1,c,dp);
        return dp[r][c];
    }
}