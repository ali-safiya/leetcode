class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<Character>();
        
        for(int i =0;i<s.length();i++){
            
            char c = s.charAt(i);
            
            if(!st.isEmpty() && st.peek() == c ){
                st.pop();
            }
            else{
                st.push(c);
            }
        }
        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        ans.reverse();
        return ans.toString();
    }
}