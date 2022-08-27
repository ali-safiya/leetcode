class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        
        Arrays.sort(arr2);
        
        int count=0;
        for(int val: arr1){
            if(search(arr2,val-d,val+d))
                count++;
        }
        
        return count;
        
    }
    
    boolean search(int[] arr ,int lowRange , int highRange){
        
        int l =0;
        int r= arr.length-1;
        
        while(l<=r){
            
            int mid=l+(r-l)/2 ;
            
            if( arr[mid]>= lowRange && arr[mid]<= highRange)
                return false;
            else if( arr[mid]< lowRange)
                l=mid+1;
            else
                r=mid-1;
                
        }
        
        return true;
    }
}