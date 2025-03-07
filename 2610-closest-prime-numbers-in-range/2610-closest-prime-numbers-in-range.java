class Solution {
    private boolean isPrime(int n){
       if (n < 2) return false;
    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) return false;
    }
     return true;
    }
    public int[] closestPrimes(int left, int right) {
        int prev = -1,a = -1,b = -1;
        int mini = Integer.MAX_VALUE;
        for(int i = left ;i<= right ;i++){
            if(isPrime(i)){
                if(prev != -1){
                    int diff = i - prev;
                    if(diff < mini){
                        mini = diff;
                        a = prev;
                        b = i;
                    }
                    if(diff == 2 || diff == 1)return new int[]{prev,i};
                }
                prev = i;
            }
        }
        return (a == -1) ? new int[]{-1,-1} : new int[]{a,b};
    }
}