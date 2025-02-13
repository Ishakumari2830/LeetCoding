class Solution {
    public int minOperations(int[] nums, int k) {
       PriorityQueue<Long> minHeap = new PriorityQueue<>(nums.length);
        for (int num : nums) {
            minHeap.add((long) num);
        }
        int cnt = 0;
        while(minHeap.peek() < k){
        long min1 = minHeap.remove();
        long min2 = minHeap.remove();
        long eq = Math.min(min1,min2)*2 + Math.max(min1,min2);
        minHeap.add(eq);
        cnt++;
        }
        
       return cnt; 
    }
}