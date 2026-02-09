// Last updated: 09/02/2026, 20:08:08
1class Solution {
2    public List<List<Integer>> combinationSum(int[] candidates, int target) {
3
4      List<List<Integer>> ans = new ArrayList<>();
5      List<Integer> temp =new ArrayList<Integer>();
6      findSum(candidates,0,target,ans,temp);
7      return ans;  
8    }
9
10    private void findSum(int[] candidates, int ind, int target, List<List<Integer>> ans, List<Integer> temp){
11        if(ind>= candidates.length || target<0) return;
12
13        if(target==0){
14            ans.add(new ArrayList<>(temp));
15            return;
16        }
17
18        temp.add(candidates[ind]);
19        findSum(candidates,ind,target-candidates[ind],ans,temp);
20        temp.remove(temp.size()-1);
21        findSum(candidates,ind+1,target,ans,temp);
22    }
23}