class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if(digits.length()==0)return res;
         HashMap<Integer,String> map=new HashMap<>();
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");
        StringBuilder temp = new StringBuilder();
        solve(0,temp,digits,map,res);
        return res;

    }
    private void solve(int ind,StringBuilder temp, String digits,HashMap<Integer, String> map,List<String> res ){
        if(ind >= digits.length()){
            res.add(temp.toString());
            return ;
        }
        String s = map.get(Character.getNumericValue(digits.charAt(ind)));
        for(int i =0;i<s.length();i++){
            temp.append(s.charAt(i));
            solve(ind+1,temp,digits,map,res);
            temp.deleteCharAt(temp.length()-1);
            
                    }
    }

}