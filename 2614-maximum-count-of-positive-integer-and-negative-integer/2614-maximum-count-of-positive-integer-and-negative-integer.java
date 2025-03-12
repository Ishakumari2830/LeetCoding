class Solution {
    public int maximumCount(int[] nums) {
       int poscnt = 0;
       int negcnt = 0;
       for(int num : nums){
        if(num > 0)poscnt++;
        else if(num < 0) negcnt++;
       } 
       return Math.max(poscnt ,negcnt);
    }
}