class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        
        Arrays.sort(nums);
        
        for(int i=0;i<n;i++){
            
            if(i>0 && nums[i]==nums[i-1])
                continue;
            
            int low =i+1;
            int high= n-1;
            
            while(low<high){
                
                if(nums[low]+nums[high] < -nums[i]){
                    low++;
                }
                else if(nums[low]+ nums[high] > -nums[i]){
                    high--;
                }
                else{
                    List<Integer> triplates = new ArrayList<Integer>();
                    
                    triplates.add(nums[i]);
                    triplates.add(nums[low]);
                    triplates.add(nums[high]);
                    
                    ans.add(new ArrayList(triplates));
                    
                    low++;
                    high--;
                    
                while(low<high && nums[low]==nums[low-1]){
                    low++;
                }
                while(low<high && nums[high]==nums[high+1]){
                    high--;
                }
                    
                }
                
               
            }
        }
        return ans;
    }
}