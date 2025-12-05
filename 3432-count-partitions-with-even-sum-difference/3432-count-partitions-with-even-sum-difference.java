class Solution {
    public int countPartitions(int[] nums) {
       int sum = 0;
       int cnt = 0;
       for(int i = 0;i<nums.length ;i++){
         sum += nums[i]; 
       }
       int leftSum = nums[0];
       int diff = 0;
       for(int i = 1;i<nums.length ;i++){
           sum -= nums[i-1];
           diff = Math.abs(sum - leftSum);
           if(diff %2 ==0)cnt++;
           leftSum += nums[i];

       }
       return cnt;
    }
}