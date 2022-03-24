class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       
        List<List<Integer>> subsets = new ArrayList<List<Integer>>();
         List<Integer> list= new ArrayList<Integer>();
        return findAllSubsets(subsets,0,nums,list);
         
    }
    
    List<List<Integer>> findAllSubsets(List<List<Integer>> subsets,int pos,int[] nums,List<Integer> list){
       
        
        if(pos>=nums.length){
            
            subsets.add(list);
            
            return subsets;
            
        }
        List<Integer> copyForInclude = new ArrayList(list);
        List<Integer> copyForExclude = new ArrayList(list);
        
        findAllSubsets(subsets,pos+1,nums,copyForExclude);
        copyForInclude.add(nums[pos]);
        findAllSubsets(subsets,pos+1,nums,copyForInclude);
        
        
        
        return subsets;
    }
}