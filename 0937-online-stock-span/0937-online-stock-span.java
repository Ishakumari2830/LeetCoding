class StockSpanner {
    Stack<Integer> st;
    ArrayList<Integer> lst ;

    public StockSpanner() {//since for each elemnt constructor will be called
    st = new Stack<>();
    lst = new ArrayList<>();

        
    }
    
    public int next(int price) {
        lst.add(price);
        //index stored inn stack and value store in arraylist;
        while(!st.isEmpty() && lst.get(st.peek())<= price){
            st.pop();

        }
        int lowerIndex = (st.isEmpty())? -1 : st.peek();
        int upperlimit = lst.size()-1;
        int ans = upperlimit - lowerIndex;
        st.push(upperlimit);
        return ans;

        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */