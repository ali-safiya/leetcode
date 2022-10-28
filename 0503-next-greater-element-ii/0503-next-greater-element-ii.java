class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        Stack<Integer> st = new Stack<>();
        
        int n =nums.length;
        int[] ans = new int[n];

        
        for(int i =(2*n)-1;i>=0;i--){
            
            while(!st.isEmpty() && nums[st.peek()] <= nums[i%n]){
                st.pop();
            }
            
            ans[i%n] = st.isEmpty() ? -1 : nums[st.peek()];
            st.push(i%n);
        }
        
        return ans;
        
    }
}