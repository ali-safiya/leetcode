// Last updated: 02/08/2025, 22:28:27
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> results = new ArrayList<>();
        List<Integer> temp = new ArrayList<Integer>();
        find(candidates,target,results,0,temp);
        return results;
        
    }

    void find(int[] candidates, int target,  List<List<Integer>> results, int index,List<Integer> temp){

        if(index== candidates.length){
            if(target==0){
                results.add(new ArrayList<>(temp));
            }
            return;
        }
        if(candidates[index] <= target){
            temp.add(candidates[index]);
            find(candidates,target-candidates[index],results,index,temp);
            temp.remove(temp.size()-1);
        }
        find(candidates,target,results,index+1,temp);
    }
}