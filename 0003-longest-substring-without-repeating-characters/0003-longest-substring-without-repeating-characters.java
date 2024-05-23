class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap <Character,Integer> mpp = new HashMap<>();
        int n = s.length();
        int l =0,r=0,maxlen = 0;
        while(r<n){
            if(mpp.containsKey(s.charAt(r))){
                l = Math.max(mpp.get(s.charAt(r))+1,l);//for next window
            }
            mpp.put(s.charAt(r),r);
            int len = r-l + 1;
            maxlen = Math.max(len,maxlen);
            r++;
        }
        return maxlen;
    }
}