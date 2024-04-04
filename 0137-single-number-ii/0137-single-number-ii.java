class Solution {
    public int singleNumber(int[] nums) {
     HashMap<Integer,Integer> mpp = new HashMap<>();
     for(int i =0;i<nums.length;i++){
        if(mpp.containsKey(nums[i])){
            mpp.put(nums[i],mpp.get(nums[i])+1);
        }
        else
        mpp.put(nums[i],1);
     }
    //  for (Map.Entry<Integer, Integer> entry : mpp.entrySet()) {
    //         if (entry.getValue() == 1) {
    //             return entry.getKey();
    //         }
    // }
    for(int key: mpp.keySet()){
        if(mpp.get(key)==1) return key;
    }
    return -1;
}
}