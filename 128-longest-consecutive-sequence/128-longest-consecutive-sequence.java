class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        for(int ele :nums){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        int max_count=0;
        for(Integer num : map.keySet()){
           
            if(!map.containsKey(num-1)){
                int temp= num;
                int count =0;
                while(map.containsKey(temp)){
                    count++;
                    temp+=1;
                }
                max_count=Math.max(count,max_count);
            }
        }
        return max_count;
        
    }
}