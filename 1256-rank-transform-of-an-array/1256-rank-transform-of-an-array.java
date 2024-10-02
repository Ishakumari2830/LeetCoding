class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] sortarr = arr.clone();
        Arrays.sort(sortarr);
        HashMap<Integer,Integer> mpp = new HashMap<>();
        int rank =1;
        for(int i =0;i<arr.length;i++){
            if(!mpp.containsKey(sortarr[i])){
                mpp.put(sortarr[i],rank++);
            }
        }
        int[] res = new int[arr.length];
        for(int i=0;i<res.length;i++){
            res[i]=mpp.get(arr[i]);
        }
        return res;
    }
}