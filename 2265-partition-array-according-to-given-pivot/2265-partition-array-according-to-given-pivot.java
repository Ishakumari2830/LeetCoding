class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
         int l= 0;
        int e = 0;
        for (int num : nums) {
            if (num < pivot) l++;
            else if (num == pivot) e++;
        }

        int[] ans = new int[nums.length];
        int lessI = 0;
        int equalI = l;
        int greaterI = l + e;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num < pivot) {
                ans[lessI] = num;
                lessI++;
            } else if (num > pivot) {
                ans[greaterI] = num;
                greaterI++;
            } else {
                ans[equalI] = num;
                equalI++;
            }
        }
        return ans;
    }
}