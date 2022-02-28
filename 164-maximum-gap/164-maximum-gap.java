class Solution {
    public int maximumGap(int[] nums) {
        
        int min=nums[0];
        int max=nums[0];
        int n=nums.length;
        if(n<2) return 0;
        for (int i=1;i<n;i++)
        {
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        int bucketSize=(max-min)/(n-1);
        if(bucketSize==0) 
            bucketSize++;
        int totalBuckets=((max-min)/(bucketSize))+1;
        int[] minBucket =new int[totalBuckets];
        int[] maxBucket =new int[totalBuckets];
        Arrays.fill(minBucket,Integer.MAX_VALUE);
        for(int i=0;i<n;i++)
        {
            int index= (nums[i]-min)/bucketSize;
            minBucket[index]=Math.min(minBucket[index],nums[i]);
            maxBucket[index]=Math.max(maxBucket[index],nums[i]);
        }
       int pre=  maxBucket[0];
        int result=0;
        for(int i=0;i<totalBuckets;i++)
        {
           if(minBucket[i]==Integer.MAX_VALUE)
               continue;
           result=Math.max(result,(minBucket[i]-pre));
                           
            pre=maxBucket[i];
            
        }
        return result;
      
    }
}