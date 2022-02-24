class Solution {
    public int maxAbsValExpr(int[] arr1, int[] arr2) {
        int n=arr1.length;
        int max1=Integer.MIN_VALUE, max2=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE, min2=Integer.MAX_VALUE;
        int max3=Integer.MIN_VALUE, max4=Integer.MIN_VALUE;
        int min3=Integer.MAX_VALUE, min4=Integer.MAX_VALUE;
        int[] b=new int[n];
        
        for(int i=0;i<n;i++)
        {
            b[i]= arr1[i]-arr2[i];
            
            arr1[i]=arr1[i]+arr2[i]+i;
            min1=Math.min(arr1[i],min1);
            max1=Math.max(arr1[i],max1);
            
            arr1[i]=2*i-(arr1[i]);
            min2=Math.min(arr1[i],min2);
            max2=Math.max(arr1[i],max2);
            
            
            b[i]+=i;
            min3=Math.min(b[i],min3);
            max3=Math.max(b[i],max3);
            
            b[i]-=2*i;
            min4=Math.min(b[i],min4);
            max4=Math.max(b[i],max4);
            
            
            
            
        }
        
        return Math.max(Math.max(max3-min3,max4-min4),Math.max(max2-min2,max1-min1));
    }
}