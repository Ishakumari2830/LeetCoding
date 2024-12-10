class Solution {
   private boolean isPsbl(int mid, String s, HashMap<Character, List<Integer>> mp) {
        int cnt;
        for (Map.Entry<Character, List<Integer>> entry : mp.entrySet()) {
            cnt = 0;
            List<Integer> values = entry.getValue();

            for (Integer val : values) {
                cnt += Math.max(0, val - mid + 1);
            }
            if (cnt >= 3) return true; 
        }
        return false; 
    }
    public int maximumLength(String s) {
        HashMap<Character, List<Integer>> mpp = new HashMap<>();
        char lastchr = s.charAt(0); 
        int cnt = 1;

      
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == lastchr) {
                cnt++; 
            } else {
               
                mpp.computeIfAbsent(lastchr, k -> new ArrayList<>()).add(cnt);
                lastchr = s.charAt(i); 
                cnt = 1;
            }
        }
      
        mpp.computeIfAbsent(lastchr, k -> new ArrayList<>()).add(cnt);

       
        int ans = -1;
        int l = 1, r = s.length() - 2;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (isPsbl(mid, s, mpp)) {
                ans = mid; 
                l = mid + 1; 
            } else {
                r = mid - 1; 
            }
        }
        return ans;
    }
}