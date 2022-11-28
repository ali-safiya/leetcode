class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        
        HashMap<Integer,Integer> freq = new HashMap<>();
        
        for(int i =0;i< matches.length ;i++){
            
            freq.put(matches[i][0] ,freq.getOrDefault(matches[i][0],0));   
            freq.put(matches[i][1],freq.getOrDefault(matches[i][1],0 )+1);
      
        }
        
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> loser = new ArrayList<>();
        List<Integer> loser2 = new ArrayList<>();
        
        for(Map.Entry<Integer,Integer> entry : freq.entrySet() ){
            
            if(entry.getValue()==0){
                loser.add(entry.getKey());
            }
            if(entry.getValue()==1){
                loser2.add(entry.getKey());
            }
        }
        
        Collections.sort(loser);
        Collections.sort(loser2);
        
        res.add(loser);
        res.add(loser2);
        
        return res;
        
    }
}