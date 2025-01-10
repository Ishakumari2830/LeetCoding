class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] req = new int[26];
        for(String word: words2){
            int[] cur = new int[26];
            for(char c : word.toCharArray()){
                cur[c- 'a']++;
                req[c-'a']=Math.max(req[c-'a'] , cur[c-'a']);
            }
        }

        List<String> ans = new ArrayList<>();
        for(String word: words1){
            int[] cur1 = new int[26];
            for(char c : word.toCharArray()){
                cur1[c-'a']++;
            
            }
            boolean isTrue = true;
            for(int i = 0;i<26;i++){
                if(cur1[i] < req[i]){
                    isTrue = false;
                    break;
                }
            }
            if(isTrue)ans.add(word);
        } 
        return ans;
    }
}