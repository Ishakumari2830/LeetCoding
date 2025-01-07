class Solution {
    private boolean isSubstring(String sub,String str){
        for(int i = 0;i<str.length();i++){
            boolean isfit = true;
            for(int j = 0;j<sub.length();j++){
if((i + j) >= str.length() || str.charAt(i+j) != sub.charAt(j)){
     isfit = false;
     break;}

            }
            if(isfit)return true;
        }
        return false;
    }
    public List<String> stringMatching(String[] words) {
        List<String> ans = new ArrayList<>();
        for(int i= 0;i<words.length;i++){
            for(int j = 0;j<words.length;j++){
                if(i==j)continue;
                if(isSubstring(words[i],words[j])){
                    ans.add(words[i]);
                    break;
                }
            }
        }
        return ans;
    }
}