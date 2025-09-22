class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long mini = Integer.MAX_VALUE;
        long maxi = Integer.MIN_VALUE;

        for(long i : nums){
            mini = Math.min(mini,i);
            maxi = Math.max(maxi ,i);

        }
        return( maxi- mini)*k ;
    }
}