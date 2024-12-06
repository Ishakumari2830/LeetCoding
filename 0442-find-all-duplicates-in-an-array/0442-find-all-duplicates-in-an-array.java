class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);
        }
          for (Map.Entry<Integer, Integer> entry : mpp.entrySet()) {
            if (entry.getValue() == 2) { 
                arr.add(entry.getKey());
            }
        }
        return arr;

    }
}