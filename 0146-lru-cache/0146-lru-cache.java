class LRUCache {
    int capacity;
    HashMap<Integer, Integer> mpp = new HashMap<>();
    Queue<Integer> q = new LinkedList<>();
    public LRUCache(int capacity) {
        this.capacity = capacity;
    }
    
    public int get(int key) {
        if(!mpp.containsKey(key))return -1;
       q.remove(key);
       q.add(key);
       return  mpp.get(key);
    }
    
    public void put(int key, int value) {
        if(mpp.containsKey(key)){
            q.remove(key);
        }else if(mpp.size() == capacity){
            int erase = q.poll();
            mpp.remove(erase);
        }
        mpp.put(key,value);
        q.add(key);

        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */