class Solution {
    
    public int subsetXORSum(int[] nums) {
        
        int n =nums.length;
        ArrayList<Integer> list = new ArrayList<Integer>();
        return findSubsets(nums,n,0,list);
    }
    
    int findSubsets(int[] nums , int n, int ind,ArrayList<Integer> list){
        
        if(ind==n){
            int x=0;
            for(int i=0;i<list.size();i++){
               x=x^ list.get(i); 
            }
    
            return x;
        }
        
        
        list.add(nums[ind]);
        
        int take = findSubsets(nums,n,ind+1,list);
        
        list.remove(list.size()-1);
        
        int notTake = findSubsets(nums,n,ind+1,list);
        
        return take+ notTake;
        
    }
}