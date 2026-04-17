class Solution {
    public int minMirrorPairDistance(int[] nums) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int minLen = Integer.MAX_VALUE;

        for(int i = 0;i<nums.length ;i++){
            int rev = reverse(nums[i]);
            if(mpp.containsKey(nums[i])){
                int j = mpp.get(nums[i]);
                int absDist = Math.abs(j-i);
                minLen = Math.min(minLen, absDist);

            }
            mpp.put(rev,i);
        }
        return minLen == Integer.MAX_VALUE ? -1 : minLen;
    }

    public int reverse(int num){

        int newNum = 0;
        while(num > 0){
            int rem = num % 10;
            newNum=newNum*10+rem;
            num/=10;

        }
        return newNum;
    }
}