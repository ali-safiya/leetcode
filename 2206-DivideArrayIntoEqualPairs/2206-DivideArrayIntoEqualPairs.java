class Solution {
    public boolean divideArray(int[] nums) {

        if(nums.length%2 !=0 ){
            return false;
        }
        
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int i = 0 ;i< nums.length; i++){

            freq.put(nums[i], freq.getOrDefault(nums[i],0)+1);
        }

        for(int num: freq.keySet()){
            if(freq.get(num) % 2 != 0){
                return false;
            }
        }

        return true ;
        
    }
}