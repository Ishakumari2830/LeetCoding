class Solution {
    public int countPrefixSuffixPairs(String[] words) {
         int count = 0;
        for(int i = 0;i<words.length;i++){
            for(int j = i+1;j<words.length;j++){
            String str1 = words[i];
               String str2 = words[j];
        

                if(str1.length()>str2.length()){
                    continue;
                }
               int l1 = str1.length();
                int l2 = str2.length();
                boolean prefix = false;
                boolean suffix = false;
                if(str1.equals(str2.substring(0,l1))) {
                    prefix = true;
                }
                if(str1.equals(str2.substring((l2-l1),l2))){
                    suffix = true;
                }
                if(prefix == true && suffix == true)
                    count ++;
                    
                }
        }
         return count;
    }
}