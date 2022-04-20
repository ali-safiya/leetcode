class Solution {
    public int longestValidParentheses(String s) {
        
        Stack<Integer> st = new Stack<Integer>();
        int max=0;
        st.push(-1);
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')
                st.push(i);
            else{
                System.out.println(st.peek());
                if(st.peek()!=-1 && s.charAt(st.peek())=='('){
                    st.pop();
                    max=Math.max(max,i-st.peek());
                }else
                    st.push(i);
            }
        }
        return max;
    }
}