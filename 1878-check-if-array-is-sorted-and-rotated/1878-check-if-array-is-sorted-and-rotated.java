class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        for(int i = 0;i<n;i++){
            boolean isMatch = true;
            for(int ind = 0;ind <n ;ind++){
                if(nums[(i + ind) % n]  != sorted[ind]){
                    isMatch = false;
                    break;
                }
            }
            if(isMatch)return true;
        
        }
        return false;
    }
}