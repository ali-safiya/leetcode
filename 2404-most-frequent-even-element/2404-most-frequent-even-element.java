class Solution {
    public int mostFrequentEven(int[] nums) {
        
        HashMap<Integer,Integer> freq = new HashMap<>();
        int maxFreq =0;
        int ele =-1;
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]%2 ==0){
                freq.put(nums[i], freq.getOrDefault(nums[i],0)+1);
                
                 if(freq.get(nums[i])== maxFreq){
                    ele = Math.min(ele, nums[i]);
                }
                if(freq.get(nums[i])> maxFreq){
                    maxFreq = freq.get(nums[i]);
                    ele=nums[i];
                }
               
            }
        }
        return ele;
    }
}