class Solution {
    public int distributeCandies(int[] candyType) {
      HashSet<Integer> set = new HashSet<Integer>();
        
        int n = candyType.length;
        
        
        for(int i=0;i<n;i++){
            if(!set.contains(candyType[i]))
                set.add(candyType[i]);
        }
        
        int uniqueCandies = set.size();
        
        return uniqueCandies>= n/2 ? n/2 : uniqueCandies;  
    }
}