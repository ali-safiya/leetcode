class Solution {
    public int sumSubarrayMins(int[] arr) {
        
        Stack<Integer> st = new Stack<Integer>();
        
        long sum=0;
        
        int mod= 1000000007;
        
        for(int i=0;i<=arr.length;i++){
            
            while(!st.empty() && (i==arr.length  ||  arr[i] <= arr[st.peek()])){
                
                int mid =st.pop();
                
                int l = st.empty() ? -1 : st.peek();
                
                int r = i;
                
                
                long count = (mid-l)*(r-mid) % mod;
                
                sum += (count * arr[mid])% mod;
                sum %= mod;
            }
            st.push(i);
        }
        return (int)(sum);
    }
}