// Last updated: 18/10/2026, 07:03:06
1class StockSpanner {
2
3    Stack<int[]> st;
4
5    public StockSpanner() {
6        st = new Stack<>();
7    }
8    
9    public int next(int price) {
10        
11        int conSmallerCount =1;
12
13        while(!st.isEmpty() && st.peek()[0] <= price){
14            conSmallerCount+= st.peek()[1];
15            st.pop();
16        }
17        st.push(new int[]{price,conSmallerCount});
18        return conSmallerCount;      
19    }
20}
21
22/**
23 * Your StockSpanner object will be instantiated and called as such:
24 * StockSpanner obj = new StockSpanner();
25 * int param_1 = obj.next(price);
26 */