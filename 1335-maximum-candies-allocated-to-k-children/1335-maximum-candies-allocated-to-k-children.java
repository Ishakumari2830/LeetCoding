class Solution {
    private boolean isPossible(long mid, int[] candies,long k){
        long cnt = 0;
      for(int candy : candies){
        cnt += candy/mid;
      } 
      return cnt >= k;
    }
    public int maximumCandies(int[] candies, long k) {
        Arrays.sort(candies);
        int n = candies.length;
        long sum = 0;
        for(int candy: candies){
            sum += candy;

        }
        if(sum < k)return 0;
        long low = 1, high = sum/k;
       
        while(low<= high){
             long mid = low + (high- low)/2;
             if(isPossible(mid,candies, k)== true)low = mid +1;
             else high = mid -1;

        }
        return (int)high;
    }
}