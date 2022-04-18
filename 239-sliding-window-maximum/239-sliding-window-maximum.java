class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        Deque<Integer> q = new ArrayDeque<>();
        int n= nums.length;
        int[] ans = new int[n-k+1];
        int j=0;
        for(int i=0;i<n;i++){
          
        
         while(!q.isEmpty() && q.peek()==i-k){
             q.pollFirst();
            
            }
        while(!q.isEmpty() && nums[q.peekLast()]<=nums[i]){
            q.pollLast();
        }
        q.add(i);
        if(i>=k-1){
        ans[j++]=nums[q.peek()];
            }
           
    }
    return ans;
    }
}