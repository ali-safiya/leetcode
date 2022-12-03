class Solution {
    public int[] numberOfPairs(int[] nums) {
        
        HashMap<Integer,Integer> freq = new HashMap<>();
        
        for(int i=0;i<nums.length ;i++){
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        }
        
        int[] ans = new int[2];
        
        for(Map.Entry<Integer,Integer> entry : freq.entrySet()){
            
            int frq = entry.getValue();
            
            ans[0]+= frq/2;
            ans[1]+= frq%2;
        }
        
        return ans;
    }
}