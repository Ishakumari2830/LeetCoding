class Solution {
    public int maxDistinctElements(int[] nums, int k) {
       int n = nums.length;
        Arrays.sort(nums);
        
        int cnt = 0;
        long last = Long.MIN_VALUE;

        for (int num : nums) {
            long left = (long) num - k;
            long right = (long) num + k;

            long candidate = Math.max(left, last + 1); 
            if (candidate <= right) {
                cnt++;
                last = candidate;
            }
        }

        return cnt;
    }
}