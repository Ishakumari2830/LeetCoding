class Solution {
    public boolean judgeSquareSum(int c) {
         if (c < 0) return false;

        int l = 0;
        int r = (int)Math.sqrt(c);

        while (l <= r) {
            long sum = (long)l * l + (long)r * r;
            if (sum == c) return true;
            if (sum < c) {
                l++;
            } else {
                r--;
            }
        }

        return false;
    }
}