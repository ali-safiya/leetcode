// Last updated: 22/02/2026, 03:32:29
1class StockSpanner {
2
3    Stack<int[]> st;
4
5    public StockSpanner() {
6        st = new Stack<int[]>();
7    }
8    
9    public int next(int price) {
10        
11        int count =1;
12        while(!st.isEmpty()  && st.peek()[0] <= price){
13            count+= st.pop()[1];
14        }
15        st.push(new int[]{price,count});
16        return count;
17    }
18}
19
20/**
21 * Your StockSpanner object will be instantiated and called as such:
22 * StockSpanner obj = new StockSpanner();
23 * int param_1 = obj.next(price);
24 */