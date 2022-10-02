class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
    
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-3;i++){
            
            if(i!=0 && nums[i]== nums[i-1])
                continue;
            
            for(int j=i+1;j<n-2;j++){
                
                if(j != i+1 && nums[j] == nums[j-1])
                    continue;
                
                int low = j+1;
                int high= n-1;
                
                long t = (long) target - nums[i] - nums[j];
                
                while(low<high){
                    
                    
                    if(nums[low]+ nums[high] > t){
                        high--;
                    }
                    else if( nums[low] + nums[high] < t ){
                        low++;
                    }
                    else{
                        
                        List<Integer> res = new ArrayList<Integer>();
                        
                        res.add(nums[i]);
                        res.add(nums[j]);
                        res.add(nums[low]);
                        res.add(nums[high]);
                        
                        ans.add(new ArrayList(res));
                        
                        low++;
                        high--;
                        
                        while(low<high && nums[low] == nums[low-1]){
                            low++;
                        }
                        
                        while(low<high && nums[high] == nums[high+1]){
                            high--;
                        }
                    }
                }
            }
        }
        return ans;
    }
}