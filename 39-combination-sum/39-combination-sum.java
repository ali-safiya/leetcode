class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        result=new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        List<Integer> list = new ArrayList<Integer>();
        
        findCombination(list,0,candidates,target);
        return result;
        
    }
    
    List<List<Integer>> result;
    
    void findCombination(List<Integer> list, int index,int[] candidates,int target){
        
        
        if(target==0){
            
            result.add(new ArrayList<Integer>(list));
            return;
        }
        
        for(int i=index;i<candidates.length;i++){
            
            if(i>index && candidates[i]==candidates[i-1])
                continue;
            if(target-candidates[i]>=0){
           
            list.add(candidates[i]);
            findCombination(list,i,candidates,target-candidates[i]);
            list.remove(list.size()-1);
            }
        }
        
        return;
    }
}