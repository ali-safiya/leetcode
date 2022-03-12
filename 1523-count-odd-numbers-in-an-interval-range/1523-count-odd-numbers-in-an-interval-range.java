class Solution {
    public int countOdds(int low, int high) {
        int count=0;
        if(low==high && low%2!=0)
            return 1;
         
        if(low%2!=0  && high%2!=0) count+= (high-low-1)/2+2;
        
        else if(low%2==0  && high%2==0) count+=Math.floor((high-low)/2);
        
        else
        
        count+=((high-low-1)/2)+1;
        
        System.out.println(count);
        
        return count;
        
    }
}