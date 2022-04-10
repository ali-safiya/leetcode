class Solution {
    public int calPoints(String[] ops) {
        
        int sum=0;
        Stack<Integer> st = new Stack<Integer>();  
        
        
       for(String s:ops){
           if(s.equals("C")){
               st.pop();
           }
           else if(s.equals("D")){
              st.push(2*st.peek()); 
           }
           else if(s.equals("+")){
               int a=st.pop();
               int b=st.peek();
               st.push(a);
               st.push(a+b);
           }
           else{
               st.push(Integer.parseInt(s));
           }
       }
       
        while(!st.isEmpty()){
            sum+=st.pop();
        }
        return sum;
    }
}