class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int pile : piles){
            pq.add(pile);
        }
       
        for(int i = 0;i<k;i++){
            if (pq.isEmpty()) break;
            int maxheap = pq.poll();
            int ans = maxheap - (int)Math.floor(maxheap/2);
            pq.add(ans);
        }
        int sum = 0;
        while (!pq.isEmpty()) {
            sum += pq.poll();
        }
        
        return sum;
    }
}