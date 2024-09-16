class Solution {
    private int convert(String time){
        String[] part = time.split(":");
        int hr = Integer.parseInt(part[0]);
        int min =Integer.parseInt(part[1]);
        return hr*60 + min;

    }
    public int findMinDifference(List<String> timePoints) {
       List<Integer> minList = new ArrayList<>();
       for(String time : timePoints){
        minList.add(convert(time));
       }
       Collections.sort(minList);
       int minDiff = Integer.MAX_VALUE;
       for(int i=1;i<minList.size();i++){
        minDiff = Math.min(minDiff,minList.get(i)-minList.get(i-1));

       }
        // Step 5: Check the wrap-around difference (last time point and first time point)
        int wrapDiff = (1440 - minList.get(minList.size() - 1)) + minList.get(0);
        minDiff = Math.min(minDiff, wrapDiff);
       return minDiff;
    }
}