class Solution {
    public boolean checkRecord(String s) {
        int cnt =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A')cnt++;
        }
        for(int i =0;i<s.length()-2;i++){
            if(s.charAt(i)== 'L' && s.charAt(i+1)== 'L' && s.charAt(i+2)=='L')return false;
        }
        if(cnt >=2)return false;
        return true;
    }
}