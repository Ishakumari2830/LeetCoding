class Solution {
    public int singleNumber(int[] nums) {
    //  HashMap<Integer,Integer> mpp = new HashMap<>();
    //  for(int i =0;i<nums.length;i++){
    //     if(mpp.containsKey(nums[i])){
    //         mpp.put(nums[i],mpp.get(nums[i])+1);
    //     }
    //     else
    //     mpp.put(nums[i],1);
    //  }
    // //  for (Map.Entry<Integer, Integer> entry : mpp.entrySet()) {
    // //         if (entry.getValue() == 1) {
    // //             return entry.getKey();
    // //         }
    // // }
    // for(int key: mpp.keySet()){
    //     if(mpp.get(key)==1) return key;
    // }
    // return -1;

    //using bit manipulation 

    int ans =0;
    int n = nums.length;
    for(int biti =0;biti<32;biti++){//traversing the 32 bit 
       int cnt =0;
        for(int i =0;i<n;i++){//traversing the array
           if((nums[i] & (1<<biti)) !=0) cnt++; // check if the ith bit is set or not  
        }
        if(cnt%3==1){
            ans= ans | (1<< biti); //set the ith bit
        }
    }
    return ans;

    
}
}