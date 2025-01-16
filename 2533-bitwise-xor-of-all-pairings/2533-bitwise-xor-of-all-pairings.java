class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
       HashMap<Integer,Integer> mpp = new HashMap<>();
       int len1 = nums1.length;
       int len2 = nums2.length;

       for(int num: nums1){
        mpp.put(num, mpp.getOrDefault(num,0)+len2);
       }
       for(int num: nums2){
        mpp.put(num, mpp.getOrDefault(num,0)+len1);
       }
       int ans = 0;

       for(int num: mpp.keySet()){
        if(mpp.get(num) % 2 == 1){
            ans ^= num;
        }
       }
       return ans;

    }
}