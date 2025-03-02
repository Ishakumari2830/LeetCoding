class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer,Integer> mpp = new TreeMap<>();
        
        for(int[] num : nums1 ){
            int first = num[0];
            int sec = num[1];
           mpp.put(first, mpp.getOrDefault(first, 0) + sec);

        }
        for(int[] num : nums2){
            int first = num[0];
            int sec = num[1];
           mpp.put(first, mpp.getOrDefault(first, 0) + sec);
        }
         int[][] res = new int[mpp.size()][2];
        int ind = 0;
        for (Map.Entry<Integer, Integer> entry : mpp.entrySet()) {
            res[ind][0] = entry.getKey();
            res[ind][1] = entry.getValue();
            ind++;
        }

        return res;

    }
}