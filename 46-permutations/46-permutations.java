class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        
        ArrayList<List<Integer>> permutations= new ArrayList<List<Integer>>();
        
        int pos=0;
        
        return findAllPermutations(nums,permutations,pos);
        
    }
    
    List<List<Integer>> findAllPermutations(int[] nums, List<List<Integer>> permutations,int pos){
        
        if(pos>=nums.length-1){
            ArrayList<Integer> Lists =new ArrayList<Integer>();
            for(int i:nums)
                Lists.add(i);
          permutations.add(Lists); 
            return permutations;
        }
        
        for(int i=pos;i<nums.length;i++){
            
            swap(i,pos,nums);
            
            findAllPermutations(nums,permutations,pos+1);
            
            swap(i,pos,nums);
        }
      return permutations;  
    }
    
    void swap(int i,int j,int[] nums){
        
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        
      
    }
}