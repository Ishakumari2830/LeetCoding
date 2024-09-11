class Solution {
    // public int minBitFlips(int start, int goal) {
    //     int cnt =0;
    //     while(start != 0 || goal != 0){
    //         if((start & 1) != (goal & 1)){
    //             cnt++;
               

    //         }
    //           start = start>>1;
    //             goal = goal>>1;
    //     }
    //     return cnt;
    // }
    public int minBitFlips(int start, int goal) {
    int cnt = 0;
    
    // XOR of start and goal will give us bits that are different
    int xor = start ^ goal;
    
    // Count the number of 1s in xor which indicates the number of flips
    while (xor != 0) {
        // If the least significant bit is 1, that means a flip is needed
        cnt += xor & 1;
        
        // Right shift xor to check the next bit
        xor >>= 1;
    }
    
    return cnt;
}

}