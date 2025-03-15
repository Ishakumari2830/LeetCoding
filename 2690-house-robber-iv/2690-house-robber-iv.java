class Solution {
    public int minCapability(int[] nums, int k) {
        int l = 1;
        int h = Arrays.stream(nums).max().getAsInt();
        int n = nums.length ;
        while(l<h){
            int mid = (l+h)/2;
            int tot = 0;
            for(int i = 0;i<n;i++){
                if(nums[i] <= mid){
                    tot ++;
                    i++;
                }
            }
            if(tot >= k)h = mid;
            else l = mid +1;
        }
        return l;
    }
}