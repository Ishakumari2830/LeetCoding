class Solution {
    public int subsetXORSum(int[] nums) {
      int totalXor = 0;
  for (int num : nums) {
    totalXor |= num;
  }
  return totalXor * (1 << (nums.length - 1));
    }
}