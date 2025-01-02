class Solution {
    
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] ans = new int[queries.length];
        HashSet<Character> st = new HashSet<>(Arrays.asList('a','e','i','o','u'));
        int[] prefixSum = new int[words.length];
        int sum = 0;
        for(int i = 0;i<words.length;i++){
            String word = words[i];
            if(st.contains(word.charAt(0)) && st.contains(word.charAt(word.length()-1))){
                sum++;
            }
            prefixSum[i]= sum;

        }
        for(int i = 0;i<queries.length;i++){
            int[] query = queries[i];
            ans[i]= prefixSum[query[1]] - (query[0] == 0 ? 0 : prefixSum[query[0]-1]);

        }
        return ans;

      
        
    }
}