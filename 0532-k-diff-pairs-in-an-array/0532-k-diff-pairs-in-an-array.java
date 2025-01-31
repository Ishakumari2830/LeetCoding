class Solution {
    public int findPairs(int[] nums, int k) {
      HashMap<Integer,Integer> mpp = new HashMap<>();
      for(int num : nums){
        mpp.put(num, mpp.getOrDefault(num,0)+1);
      }

      int cnt = 0;
      for(int i : mpp.keySet()){
        if(k== 0  && mpp.get(i)>1) cnt++;
        if(k>0 &&  mpp.containsKey(k+i)) cnt++;
      }
      return cnt;
    }
}