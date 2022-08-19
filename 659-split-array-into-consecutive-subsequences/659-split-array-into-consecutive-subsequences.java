class Solution {
    public boolean isPossible(int[] nums) {
        
        HashMap<Integer,Integer> freqMap = new HashMap<Integer,Integer>();
        
        HashMap<Integer,Integer> subs = new HashMap<Integer,Integer>();
        
        
        for(int num:nums){
            freqMap.put(num ,freqMap.getOrDefault(num,0)+1);
        }
        
        for(int ele :nums){
            
            if(freqMap.get(ele)==0)
                continue;
            
            if(subs.getOrDefault(ele,0)>0){
                
                freqMap.put(ele, freqMap.get(ele)-1);
                subs.put(ele, subs.get(ele)-1);
                subs.put(ele+1,subs.getOrDefault(ele+1,0)+1);
            }
            else if(freqMap.getOrDefault(ele,0)>0 && freqMap.getOrDefault(ele + 1,0)>0 && freqMap.getOrDefault(ele + 2,0)>0){
                freqMap.put(ele, freqMap.get(ele)-1);
                freqMap.put(ele+1, freqMap.get(ele+1)-1);
                freqMap.put(ele+2, freqMap.get(ele+2)-1);
                subs.put(ele+3,subs.getOrDefault(ele+3,0)+1);
                
            }
            else
               return false;
        }
        return true;
    }
}