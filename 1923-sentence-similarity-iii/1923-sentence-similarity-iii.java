class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        String word1[] = sentence1.split(" ");
         String word2[] = sentence2.split(" ");
         int n = word1.length;
         int m = word2.length;
         int i =0;
        while(i<Math.min(n,m) && word1[i].equals(word2[i])){
            i++;
        } 
          int j =0;
        while(j<Math.min(n,m) && word1[n-1-j].equals(word2[m-1-j])){
            j++;
        } 
        return (i+j >= Math.min(n,m));
    }
}