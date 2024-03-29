class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        for(int i=0;i<nums.length;i++){
            
            if(map.containsKey(nums[i])){
                int gap = i-map.get(nums[i]);
                if(gap<=k)
                    return true;
                else
                    map.put(nums[i],i);
            }
            else{
                map.put(nums[i],i);
            }
        }
        
        return false;
    }
}