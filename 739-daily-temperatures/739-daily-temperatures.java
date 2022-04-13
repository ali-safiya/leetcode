class Pair{
    int temp;
    int index;
    Pair(int temp,int index){
        this.temp=temp;
        this.index=index;       
    }
}

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        Stack<Pair> st = new Stack<Pair>();
        int n =temperatures.length;
        
        int[] ans = new int[n];
        
        for(int i=temperatures.length-1;i>=0;i--){
            
            while(!st.isEmpty() && st.peek().temp<=temperatures[i]){
                st.pop();
            }
            
            if(!st.isEmpty()  && st.peek().temp>temperatures[i]){
                ans[i]=st.peek().index-i;
            }
            
            st.push(new Pair(temperatures[i],i));
            
        }
        return ans;
    }
}