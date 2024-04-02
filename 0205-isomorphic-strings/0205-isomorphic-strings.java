class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s==null || s.length() <=1) return true;
      HashMap<Character,Character>map=new HashMap<Character,Character>();
      for(int i=0;i<s.length();i++){
         char x=s.charAt(i);
         char y=t.charAt(i);
         if(map.containsKey(x)){
             if(!map.get(x).equals(y))
             return false;
         } 
         else{
             if(!map.containsValue(y))
             map.put(x,y);
             else
                 return false;
             

         }
      } 
      return true; 
    }
}