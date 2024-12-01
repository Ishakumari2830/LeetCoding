class Solution {
    public int getLargestOutlier(int[] nums) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int sum = 0;
    
        for (int num : nums) {
            mpp.put(num, mpp.getOrDefault(num, 0) + 1);
            sum += num;
        }
        int maxi = Integer.MIN_VALUE;
        for(int num : nums){
            long reqSum = sum - num;
            if(reqSum % 2 != 0)continue;
            long potentialSum = reqSum /2;
            mpp.put(num, mpp.get(num)-1);
            int sumElm = (int) potentialSum;
            int cnt = mpp.getOrDefault(sumElm , 0);
            if(cnt > 0)maxi = Math.max(maxi, num);
            mpp.put(num,mpp.get(num) +1);
        }
       
        return maxi;
        
    }
}