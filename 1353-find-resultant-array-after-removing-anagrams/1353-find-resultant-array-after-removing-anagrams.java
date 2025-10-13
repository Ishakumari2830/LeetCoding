class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> ans = new ArrayList<>();
        ans.add(words[0]);
        for(int i = 1;i<words.length;i++){
            String word1=ans.getLast();
            String word2=words[i];

            char[] ch=word1.toCharArray();
            char[] ch1 = word2.toCharArray();
            Arrays.sort(ch);
            Arrays.sort(ch1);
            String sorted1 = new String(ch);
             String sorted2 = new String(ch1);
            if(!sorted1.equals(sorted2)){
                ans.add(word2);
            }
        }

        return ans;
    }
}