class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer> freq =new  HashMap<Integer,Integer>();
        
        for(int i=0;i<nums.length;i++){
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        }
        int n=nums.length;
        int[] ans =new int[k];
        
        PriorityQueue<Integer> ele = new PriorityQueue<Integer>((o1,o2)->freq.get(o1)-freq.get(o2));
        int i=k;
        for(Map.Entry<Integer,Integer>  pair : freq.entrySet() ){
            ele.add(pair.getKey());
            if(ele.size()>k){
                ele.remove();
                
            }
        }
        while(!ele.isEmpty()){
           ans[--i]=ele.poll(); 
        }
        return ans;
    }
}