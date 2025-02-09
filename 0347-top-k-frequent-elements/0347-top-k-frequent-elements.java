class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> mpp = new HashMap<>();
      
        for(int i = 0;i<nums.length ;i++){
            mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);
        }

        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));

        for (Map.Entry<Integer, Integer> entry : mpp.entrySet()) {
            minHeap.offer(new int[]{entry.getKey(), entry.getValue()});
            if (minHeap.size() > k) {
                minHeap.poll(); 
            }
        }

        int[] ans = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            ans[i] = minHeap.poll()[0];
        }

        return ans;
    }
}