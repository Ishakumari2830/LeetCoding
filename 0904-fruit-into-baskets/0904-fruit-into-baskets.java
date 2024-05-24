class Solution {
    public int totalFruit(int[] fruits) {
       HashMap<Integer,Integer> mpp = new HashMap<>();
       int l =0,r=0,maxlen =0;
       while(r<fruits.length){
        mpp.put(fruits[r],mpp.getOrDefault(fruits[r],0)+1);
        if(mpp.size()>2){
            while(mpp.size()>2){
                mpp.put(fruits[l],mpp.get(fruits[l])-1);
                if(mpp.get(fruits[l])==0){
                    mpp.remove(fruits[l]);
                }
                l++;
            }
        }
        if(mpp.size()<=2){
            maxlen = Math.max(maxlen,r-l+1);
            r++;
        }
       } 
       return maxlen;
    }
}