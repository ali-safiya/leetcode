class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        
        Arrays.sort(nums);
        
        int first= search(nums,target,true);
        int last =search(nums,target,false);
        
          ArrayList<Integer> list= new ArrayList<Integer>();
        
        if(first == -1 || last ==-1)
            return list;
        for(int i=first;i<=last;i++){
            list.add(i);
        }
       return list; 
    }
    int search(int[] nums,int target,boolean isFirst){
        
        int l=0;
        int r=nums.length-1;
        int ans=-1;
          
        while(l<=r){
            int mid=l+ (r-l)/2;
            
            if(nums[mid]==target){
                ans=mid;
                if(isFirst){
                    r=mid-1;
                }
                else      
                  l=mid+1;
            }
            else if(nums[mid]<target){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        
        return ans;
    }
}