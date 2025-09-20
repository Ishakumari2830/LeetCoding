class Solution {
    boolean allZero(int[] counter){
        for(int i : counter){
            if( i != 0)return false;
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int[] counter = new int[26];
        int n = s.length();
        for(int i = 0 ;i<p.length();i++){
            counter[p.charAt(i)-'a']++;
        }

        int i =0,j = 0;
        while(j < n){
            counter[s.charAt(j)-'a']--;
            if((j-i+1) == p.length()){
                if(allZero(counter)){
                    ans.add(i);
                }
                counter[s.charAt(i)-'a']++;
                i++;

            }
            j++;
        }
        return ans;
    }
}