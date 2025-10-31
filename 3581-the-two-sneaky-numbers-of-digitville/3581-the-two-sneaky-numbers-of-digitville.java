class Solution {
    public int[] getSneakyNumbers(int[] nums) {
       int[] ans = new int[2];
       int i=0;
       HashMap<Integer, Integer> mpp= new HashMap<>();
       for(int num : nums){
        if(mpp.containsKey(num)){
            ans[i++]=num;
        }
        else mpp.put(num , mpp.getOrDefault(num,0)+1);
       }
       return ans;
    }
}