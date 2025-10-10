class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        //finding min speed to eat all banana in h hr
        //min = 1 , max = max(piles[i])
        int l = 1;
        int high= 0;
        for(int pile : piles){
            high = Math.max(high , pile);
        }

        while(l <=high){
            int mid = l +(high-l)/2;
            int hr = 0;
            for(int pile : piles){
                hr += Math.ceil((double) pile/mid);
            }
            if(hr <= h)high = mid-1 ;
            else l = mid +1;
        }
        return l;
    }
}