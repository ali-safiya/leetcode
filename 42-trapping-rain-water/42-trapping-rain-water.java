class Solution {
    public int trap(int[] a) {
        int sum=0;
        int left=0;
        int right=0;
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            int j=0;
            right=0;
            for(j=i+1;j<n;j++)
            {
               
                if(a[j]>=right)
                {
                    right=a[j];
                }
                    
            }
            left=0 ;
            int k=0;
            for(k=i-1;k>=0;k--)
            {
                if(a[k]>=left)
                {
                     left=a[k];
    
                }
      
            }
          
                
            
            if(Math.min(left,right)>a[i])
                sum+=Math.min(left,right)-a[i];
           
        }
        return sum;
    }
}