class Solution {
    public int maxChunksToSorted(int[] arr) {
        int noOfChunks=0;
        int sum=0;
       for(int i=0;i<arr.length;i++)
       {
         sum+=(i-arr[i]);
           if(sum==0)
               noOfChunks++;
       }
        return noOfChunks;
    }
}