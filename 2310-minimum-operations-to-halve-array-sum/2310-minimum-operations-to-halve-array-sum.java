class Solution {
    public int halveArray(int[] nums) {
        PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());
         long sum = 0;
        for(int num : nums){
            pq.add((double)num);
            sum += num;
        }
       
     
        double target = sum / 2.0;
        double ans= 0.0;
        int operation = 0;
       while(ans <= target){
       
        double maxheap =pq.poll();
        double div = maxheap/2.0 ;
        ans += div;
        pq.add(div);
         operation++;
        
        if(ans == target)break;
       


       }

       return operation;
    }
}