class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        
        PriorityQueue<int []> pq = new PriorityQueue<>((a,b)->a[2]-b[2]);

        ArrayList<List<Integer>> ans = new ArrayList<List<Integer>>();
    
       
        for(int i=0;i<nums1.length;i++){
           pq.add(new int[]{i,0,nums1[i]+ nums2[0]}); 
        }
        
        while(!pq.isEmpty() && k-->0){
           int[] cur =pq.poll();
            int i= cur[0];
            int j=cur[1];
            ans.add(Arrays.asList(nums1[i],nums2[j]));
            if(j+1==nums2.length)
                continue;
            
           pq.add(new int[]{i,j+1,nums1[i]+ nums2[j+1]});  
        }
        
        return ans;
    }
}
