class Solution {
    public String makeFancyString(String s) {
        StringBuilder res = new StringBuilder();
        int len = s.length();
        for(int i =0;i<len;i++){
          if(i<2 ||  !(s.charAt(i)==res.charAt(res.length()-1) &&  s.charAt(i)==res.charAt(res.length()-2))){
            res.append(s.charAt(i));
          }
        }
        return res.toString();

    }
}