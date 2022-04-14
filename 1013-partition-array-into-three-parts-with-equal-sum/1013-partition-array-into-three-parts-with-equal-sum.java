class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
       int sum=0;
        int n=arr.length;
        
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
         if(sum%3!=0) return false;
        int i=1;
        int curSum=arr[0];
        
        while(i<n && curSum!=sum/3){
        curSum+=arr[i];
        i++;
        }
        
        if(i>n-1 || curSum!=sum/3)
            return false;
        curSum=arr[i++];
        
        while(i<n && curSum!=sum/3){
        curSum+=arr[i];
        i++;
        }
        
        if(i>n-1 || curSum!=sum/3)
            return false;
        curSum=arr[i++];
        
        while(i<n && curSum!=sum/3){
        curSum+=arr[i];
        i++;
        }
        
        if(i>n || curSum!=sum/3)
            return false;
      return true;
        
            
    }
}