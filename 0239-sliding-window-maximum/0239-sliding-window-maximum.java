class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
       int n = nums.length;
       int[] ans = new int[n-k +1];
       Deque<Integer> dq = new ArrayDeque<>();
       int j = 0;
       for(int i = 0;i<n;i++){
        //step 1 : make space for nums[i], size window check
        while(!dq.isEmpty() && dq.getFirst() <= i-k){
            dq.pollFirst();
        }
        //step 2 : greater than : check nums[i] > dq.getLast()
        while(!dq.isEmpty() && nums[i] > nums[dq.getLast()]){
            dq.pollLast();
        }
        //step 3 :add to dq
        dq.addLast(i);
        if( i>= k-1){
            ans[j] = nums[dq.getFirst()];
            j++;
        }
       } 
       return ans;
    }
}