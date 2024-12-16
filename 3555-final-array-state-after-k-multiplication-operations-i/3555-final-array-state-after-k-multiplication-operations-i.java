class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
         PriorityQueue<int[]> pq = new PriorityQueue<>( Comparator.<int[]>comparingInt(a -> a[0]).thenComparingInt(a -> a[1]));
        
     
        for (int i = 0; i < nums.length; i++) {
            pq.add(new int[]{nums[i], i});
        }
      
        while (k > 0) {
            
            int[] minArray = pq.poll();
            int val = minArray[0];
            int ind = minArray[1];
            
         
            int chng = val * multiplier;
            nums[ind] = chng;
            
           
            pq.add(new int[]{nums[ind], ind});
            
          
            k--;
        }
        
        return nums;
    }
}