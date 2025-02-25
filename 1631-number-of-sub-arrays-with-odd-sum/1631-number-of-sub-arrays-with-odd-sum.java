class Solution {
    public int numOfSubarrays(int[] arr) {
        int mod = 1_000_000_007;
        int prefixSum = 0;
        int evenCnt = 1;
        int oddCnt = 0;
        int cnt = 0;
        for(int num : arr){
            prefixSum += num;
            if(prefixSum % 2 == 0){//even
                cnt += oddCnt ;
                evenCnt++;

            }
            else {
                cnt += evenCnt;
                oddCnt ++;
            }
            cnt %= mod;
        }
        return cnt ;
    }
}