class Solution {
    public List<String> commonChars(String[] words) {
      int[] minfreq = new int[26];
      for(char c : words[0].toCharArray()){
        minfreq[c-'a']++;
      }
      for (int i = 1; i < words.length; i++) {
            int[] charFreq = new int[26];
            for (char c : words[i].toCharArray()) {
                charFreq[c - 'a']++;
            }

            // Update the minimum frequency array
            for (int j = 0; j < 26; j++) {
                minfreq[j] = Math.min(minfreq[j], charFreq[j]);
            }
        }
         List<String> result = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < minfreq[i]; j++) {
                result.add(String.valueOf((char) (i + 'a')));
            }
        }

        return result;
    }
}