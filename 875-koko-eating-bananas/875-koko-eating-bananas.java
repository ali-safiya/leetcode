class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int low =0;
        int high =1;
        for(int pile : piles){
            high = Math.max(high,pile);
        }
       
        while(low<high){
            int mid = (high+low)/2;
            
            if(canAccomodate(mid,piles,h)){
                high=mid;
              
            }
            else
                low=mid+1;
        }
        return high;
    }
    boolean canAccomodate(int output , int[] piles,int h){
        int k=0;
        for(int i=0;i<piles.length;i++){
            k+=Math.ceil((double)piles[i]/output);
        }
        if(h<k)
            return false;
        else
            return true;
    }
}