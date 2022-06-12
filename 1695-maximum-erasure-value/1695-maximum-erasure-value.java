class Solution {
    public int maximumUniqueSubarray(int[] nums) {
    
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        int totalSum=0;
        int n= nums.length;
        int[] prefixSum= new int[n+1];
        int l=0;
        
        for(int i=0;i<n;i++){
            
            prefixSum[i+1]=prefixSum[i]+ nums[i];
            
            if(map.containsKey(nums[i])){
                l= Math.max(l,map.get(nums[i])+1);
            }
            totalSum=Math.max(totalSum, prefixSum[i+1]-prefixSum[l]);
            map.put(nums[i],i);
        }
        return totalSum;
       
    }
}