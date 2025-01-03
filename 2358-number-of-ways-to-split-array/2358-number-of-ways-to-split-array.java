class Solution {
    public int waysToSplitArray(int[] nums) {
        // will give tle so use prefix sum
        // long sumleft = 0;
        // long sumright = 0;
        // int cnt = 0;
        // int j = 0;
        // while(j<nums.length-1){
        //     sumleft += nums[j];
        //     sumright = 0;
        //     for(int i = j+1;i<nums.length;i++){
        //         sumright += nums[i];
        //     }
        //     if(sumleft >= sumright)cnt++;
        //     j++;
        // }
        
        // return cnt;
          long sumleft = 0;
        long sumright = 0;
        for(int num : nums){
            sumright += num;
        }
        int cnt = 0;
        for(int i= 0;i<nums.length-1;i++){
            sumleft += nums[i];
            sumright -=nums[i];
            if(sumleft>=sumright)cnt++;
        }
        return cnt;
        

    }
}