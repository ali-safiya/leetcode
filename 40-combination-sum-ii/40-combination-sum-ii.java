class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
       
       Arrays.sort(candidates); 
       List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        List<Integer>  list = new ArrayList<Integer>();
        
        return findCombination(result,list,target,candidates,0);
        
    }
    
    List<List<Integer>> findCombination (List<List<Integer>> result,List<Integer> list,int target,int[] candidates,int index){
        
        if(target==0){
            
            result.add(new ArrayList<Integer>(list));
            return result;
        }
        if(index==candidates.length)
            return result;
        
        for(int i=index;i<candidates.length;i++){
         
            if(i!=index && candidates[i]==candidates[i-1])
                continue;
            if(candidates[i]<=target){
            list.add(candidates[i]);
            findCombination(result,list,target-candidates[i],candidates,i+1);
            list.remove(list.size()-1);
            }
            else 
                break;
        }
         return result;
    }
   
}