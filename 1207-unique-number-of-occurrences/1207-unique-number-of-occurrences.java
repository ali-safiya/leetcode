class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        
        HashMap<Integer,Integer> freq = new HashMap<>();
        
        for(int num :arr){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        
        HashSet<Integer> freqSet = new HashSet<>(freq.values());
        
        return freqSet.size()==freq.size();
    }
}