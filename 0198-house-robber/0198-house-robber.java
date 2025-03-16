class Solution {
    public int rob(int[] nums) {
        int prev = 0;
        int maxi = 0;
        for(int num : nums){
            int temp = Math.max(maxi , prev+ num);
             prev= maxi;
            maxi = temp;
        }
        return maxi;
    }
}