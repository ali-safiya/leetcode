class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        HashMap<Integer,Integer> freq = new HashMap<>();
        
        for(int num : arr){
            
            freq.put(num , freq.getOrDefault(num,0)+1);
        }
        
        HashSet<Integer> uniqueNum = new HashSet<>(freq.values());
        
        return uniqueNum.size() == freq.size();
    }
}