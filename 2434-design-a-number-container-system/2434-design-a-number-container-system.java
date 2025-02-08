class NumberContainers {
    HashMap<Integer, Integer> idxToNum = new HashMap<>();
    TreeMap<Integer, TreeSet<Integer>> numToIdx = new TreeMap<>();


    public NumberContainers() {
        //constructor,nothing to do 
    }
    
    public void change(int index, int number) {
       if(idxToNum.containsKey(index)){
        int prev = idxToNum.get(index);
        numToIdx.get(prev).remove(index);

        if(numToIdx.get(prev).isEmpty()){
            numToIdx.remove(prev);

        }
       }
       idxToNum.put(index,number);
       numToIdx.putIfAbsent(number,new TreeSet<>());
       numToIdx.get(number).add(index);

    }
    
    public int find(int number) {
        if (numToIdx.containsKey(number) && !numToIdx.get(number).isEmpty()) {
            return numToIdx.get(number).first(); 
        }
        return -1;
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */