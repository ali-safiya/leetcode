class Solution {
    public int numIdenticalPairs(int[] nums) {
     HashMap<Integer,Integer> map =new HashMap<Integer,Integer>();
        
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int ans=0;
        for(int k : map.keySet()){
           int i= map.get(k);
          
            if(i>1){
                ans+= (i * (i-1))/2;
            }
        }
        return ans;
    }
}