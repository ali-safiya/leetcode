// Last updated: 03/08/2025, 23:25:08
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        Arrays.sort(candidates); 
        HashSet<List<Integer>> results = new HashSet<>();
        List<Integer> temp = new ArrayList<>();

        find(results,temp,target,0,candidates);
        
        List<List<Integer>> resultList = new ArrayList<>(results);

        return resultList;
    }

    private void find( HashSet<List<Integer>> results,List<Integer> temp,int target, int index, int[] candidates){


         if(target == 0){
                results.add(new ArrayList<>(temp));
                return;
            }

        for(int i= index;i<candidates.length;i++){

            if(i > index && candidates[i]== candidates[i-1]) continue;
            if(candidates[i]> target) break;
             
            temp.add(candidates[i]);
            find(results,temp,target-candidates[i],i+1, candidates);
            temp.remove(temp.size()-1);
        }
    }

}