class Solution {
    private int power(int num){
       if(num == 1)return 0;
       int pow = 1 + ((num %2 == 0) ? power(num/2) : power((3*num)+1));
       return pow;
    }
    public int getKth(int lo, int hi, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> b[1]!=a[1] ?a[1]-b[1]:a[0]-b[0]);
        for(int i = lo;i<= hi;i++) {
            pq.add(new int[]{i, power(i)});
        }
       while (!pq.isEmpty() && k-->1) { 
            pq.poll();
        }
        return pq.poll()[0];
    }
    
}
