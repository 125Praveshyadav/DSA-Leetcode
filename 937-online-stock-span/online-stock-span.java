class StockSpanner {
    //ye monotonic decrease 
    Stack<int[]> st;
    public StockSpanner() {
        st = new Stack<>();      
    }
    public int next(int price) {
        int span = 1;//mtlb ye hoga hi agr prev consecutive decrease nhi mila to curr element ka span = 1 hi hoga 
        while(!st.isEmpty() && st.peek()[0] <= price){
            span += st.pop()[1];
        }
        st.push(new int[]{price , span});
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */