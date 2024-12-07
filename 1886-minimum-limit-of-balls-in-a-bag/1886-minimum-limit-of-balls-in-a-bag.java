class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int low = 1 , high = Arrays.stream(nums).max().getAsInt();
        while(low< high){
            int mid = (low + high)/2;
            int oper = 0;
            for(int n : nums){
                oper += (n-1)/mid;
            }
            if(oper <= maxOperations)high = mid;
            else low = mid +1;
        }
        return high;
    }
}