class ProductOfNumbers {
    ArrayList<Integer> al = new ArrayList<>();
    int prod = 1;

    public ProductOfNumbers() {
        
    }
    
    public void add(int num) {
        al.add(num);
    }
    
    public int getProduct(int k) {
         int prod = 1;  // Reset prod for each call
        for (int i = al.size() - 1; i >= al.size() - k; i--) {
            prod *= al.get(i);
        }
        return prod;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */