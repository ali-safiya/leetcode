class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
  
        HashSet<List<Integer>> per =new HashSet<List<Integer>>();
        findUniquePer(per,nums,0);
       List<List<Integer>> result = new ArrayList<List<Integer>>();
        for(List<Integer> i :per)
            result.add(i);
        
        return  result;
    }
    
    HashSet<List<Integer>> findUniquePer( HashSet<List<Integer>> per,int[] nums,int pos){
        
        if(pos>=nums.length){
            List<Integer> list=new ArrayList<Integer>();
            for(int i:nums)
              list.add(i);
            per.add(list);
        return per;
            
        }
        
        for(int i=pos;i<nums.length;i++){
            
            swap(i,pos,nums);
            findUniquePer(per,nums,pos+1);
            swap(i,pos,nums);
        }
        
        return per;
    }
    
    
    void swap(int i, int j,int[] nums){
        
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        
    }
    
}