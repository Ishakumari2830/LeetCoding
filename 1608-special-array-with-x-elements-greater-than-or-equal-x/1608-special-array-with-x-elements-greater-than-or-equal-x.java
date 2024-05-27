class Solution {
    public int specialArray(int[] nums) {
     Arrays.sort(nums);
        int n = nums.length;

        for (int x = 1; x <= n; x++) {
            // Count how many numbers are greater than or equal to x
            int count = 0;
            for (int num : nums) {
                if (num >= x) {
                    count++;
                }
            }
            if (count == x) {
                return x;
            }
        }

        return -1;  // Return -1 if no such x exists
       

    }
}