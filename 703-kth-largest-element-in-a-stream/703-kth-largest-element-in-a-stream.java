class KthLargest {
   PriorityQueue<Integer> ans = new PriorityQueue<>();
   int k;
    public KthLargest(int k, int[] nums) {
       for(int ele:nums){
           ans.add(ele);
       }
        this.k=k;
    }
    
    public int add(int val) {
        
        ans.add(val);
        
        while(ans.size()>k){
            ans.remove();
        }
       return ans.peek(); 
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */