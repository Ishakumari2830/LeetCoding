class Solution {
    public int mirrorDistance(int n) {
        int temp = n ;
        int rev = 0;
        while(temp != 0){
            int newNum = temp % 10;
            rev = rev * 10 + newNum ;
            temp /= 10;
        }

        int ans = Math.abs(rev - n);
        return ans;
    }
}