class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        
        List<List<Integer>> subsets = new ArrayList<List<Integer>>(); 
        List<Integer>  list =new ArrayList<Integer>();
        Arrays.sort(nums); 
        return findAllSubsets (subsets,list,nums,0);
        
    }
    
    List<List<Integer>>   findAllSubsets( List<List<Integer>> subsets, List<Integer> list ,int[] nums ,int pos){

            subsets.add(new ArrayList<Integer>(list));

         for(int i=pos;i<nums.length;i++){
             
             if( i>pos && nums[i]==nums[i-1])    continue;
                
          
            list.add(nums[i]);
           
            findAllSubsets(subsets,list,nums,i+1);
            
            list.remove(list.size()-1);
        
         }
        return subsets;
    }
}

