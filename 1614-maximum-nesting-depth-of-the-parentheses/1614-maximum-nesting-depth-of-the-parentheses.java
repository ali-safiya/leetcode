class Solution {
    public int maxDepth(String s) {
        Stack<Character> st = new Stack<>();
        
        int degree=0;
        
        for(int i=0;i<s.length();i++){
            
            if(s.charAt(i)=='('){
                st.push('(');
            }
            if(s.charAt(i)==')'){
                st.pop();
            }
            
            degree= Math.max(degree,st.size());
        }
        
        return degree;
        
    }
}