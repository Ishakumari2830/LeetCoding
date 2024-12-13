class Solution {
    public int[] numberGame(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num : nums){
            pq.add(num);
        }
        int arr[] = new int[nums.length];
        for(int i = 0;i<nums.length-1;i+=2){
            int alice = pq.poll();
            int bob = pq.poll();
            arr[i]=bob;
            arr[i+1]= alice;


        }
        return arr;
    }
}