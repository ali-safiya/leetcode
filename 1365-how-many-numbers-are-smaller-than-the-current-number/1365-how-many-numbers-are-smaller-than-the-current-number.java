class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        
    
        for(int i=0;i<nums.length;i++){
         l.add(nums[i]);   
        }
            Collections.sort(l);
        for(int i=0;i<nums.length;i++){
         nums[i]=l.indexOf(nums[i]);   
        }
        
        return nums;
    }
}