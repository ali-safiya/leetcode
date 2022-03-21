class Solution {
    public int shipWithinDays(int[] weights, int days) {
    
        int low=0;
        int high;
        int sum=0;
        for(int i=0;i<weights.length;i++){
            sum+=weights[i];
            low=Math.max(low,weights[i]);
        }
        high=sum;
        int ans=sum;
        
        
        while(low<=high){
            
            int mid=(low+high)/2;
            int noOfDays = check(mid,weights);
             
           if(noOfDays>days)
                low=mid+1;
            else{
                ans=Math.min(ans,mid);
                high=mid-1;
            
            }
        }
        return ans;
        
    }
    
    int check(int total ,int[] weights){
        
        int noOfDays=0;
        int temp=0;
        for(int i=0;i<weights.length;i++){
            
            temp+=weights[i];
            if(temp>(total))
            {
                
            noOfDays++;
           temp=weights[i];
            }  
        }
       
        return noOfDays+1;
    }
}