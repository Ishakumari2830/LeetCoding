class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        int cnt = 0;
        while((sum % k) != 0){
            cnt++;
            sum--;
        }
        return cnt;
    }
}