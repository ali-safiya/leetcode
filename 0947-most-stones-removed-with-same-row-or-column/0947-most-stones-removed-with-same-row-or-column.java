class Solution {
    public int removeStones(int[][] stones) {
        
        HashSet<Pair<Integer,Integer>> set = new HashSet<>();
        int ans=stones.length;
        
        for(int i=0;i<stones.length;i++){
            
            if(!set.contains(new Pair<Integer,Integer>(stones[i][0],stones[i][1]))){
                dfs(set,stones,stones[i][0],stones[i][1]);
                ans--;
            }
        }
        return ans;
        
    }
    
    void dfs(HashSet<Pair<Integer,Integer>> set, int[][] stones , int row , int col){
        set.add(new Pair<>(row,col));
        for(int i=0;i<stones.length;i++){
            
            if(!set.contains(new Pair<Integer,Integer>(stones[i][0],stones[i][1]))){
                if(row==stones[i][0] || col==stones[i][1]){
                    dfs(set,stones,stones[i][0],stones[i][1]);
                }
            }
        }
    }
}