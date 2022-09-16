class Solution {
    public int majorityElement(int[] nums) {
        
        int n=nums.length;
        
        int ans=0;
        
        for(int i=0;i<32;i++){
            
            int bit =1<<i;
            int count=0;
            for(int num: nums){
                
                if((num & bit)!=0)
                    count++;
            }
            
            if(count> n/2){
                
                ans|= bit;
            }
        }
        
        return ans;
    }
}