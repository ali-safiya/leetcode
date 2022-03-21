class Solution {
    public int maxDistance(int[] position, int m) {
        
        int low=1;
        int high=Integer.MIN_VALUE;
        
        for(int i=0;i<position.length;i++)
            high=Math.max(high,position[i]);
        
        return findMaxDistance(position,low,high,m);
        
    }
    int findMaxDistance( int[] position,int low,int high,int m){
        
        int ans=-1;
        
        while(low<=high){
           int mid=(low+high)/2;
            
            if(canAccomodate(position,mid,m)){
                ans=mid;
                low=mid+1;
            }
            else
                high=mid-1;
        }
        return ans;
    }
    
    boolean canAccomodate(int[] position,int gap,int noOfBalls){
        
        int bucket=1;
        int lastPos=0;
        Arrays.sort(position);
        for(int i=0;i<position.length;i++){
            
            if(position[i]-position[lastPos]>=gap){
                bucket++;
                
            
            if(bucket==noOfBalls)
                return true;
            
            lastPos=i;
            }
        }
        
        return false;
    }
}