class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int index=0;
       while(!map.isEmpty()){
           
           int min=Integer.MAX_VALUE, key=0, cur_value=0;
           
           for(Map.Entry<Integer,Integer> entry : map.entrySet()){
               
               cur_value=entry.getValue();
               
               if(cur_value<min){
                   min=cur_value;
                   key=entry.getKey();
                   
               }
               if(cur_value==min){
                   if(key<entry.getKey()){
                       key=entry.getKey();
                   }
               }         
               
           }
           while(min-->0)
               nums[index++]=key;
           
           map.remove(key);
           
       }
        return nums;
    }
}