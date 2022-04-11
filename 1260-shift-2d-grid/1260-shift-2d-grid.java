class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n=grid[0].length;
        
        int t= m*n;
        k=k%t;
        List<List<Integer>> ans =new ArrayList<List<Integer>>();
        
        for(int i=0;i<m;i++ ){
            ans.add(new ArrayList<>());
        }
        
        for(int i=0;i<t;i++){
            
            int index=(t-k+i)%t;
            
            ans.get(i/n).add(grid[index/n][index%n]);
        }
        
        return ans;
    }
}