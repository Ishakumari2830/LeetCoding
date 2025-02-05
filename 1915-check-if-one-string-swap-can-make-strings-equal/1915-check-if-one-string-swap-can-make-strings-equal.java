class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) return true;
       int n1 = s1.length();
       int first = -1;
       int sec = -1;
       int cnt = 0;
       for(int i = 0;i<n1;i++){
        if(s1.charAt(i)  != s2.charAt(i)){
            cnt ++;
            if(first == -1){
                first =i;
            }
            else sec = i;
        }
       }
       if(cnt != 2)return false;
       return (s1.charAt(first) == s2.charAt(sec) && s1.charAt(sec) == s2.charAt(first));


    }
}