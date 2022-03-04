class Solution {
    public int maxChunksToSorted(int[] arr) {
        int[]  rightmin=new int[arr.length];
        int n=arr.length;
        int leftmax=0;
        int counter=0;
         rightmin[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
            rightmin[i]=Math.min(arr[i],rightmin[i+1]);
           
        }
        
        for(int i=0;i<arr.length-1;i++)
        {
          
         leftmax=Math.max(arr[i],leftmax);
          
             
            if(rightmin[i+1]>=leftmax)
                counter++;
        }
        return ++counter;
    }
}