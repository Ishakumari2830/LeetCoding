class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> ans = new ArrayList<>();
        
        for(int i = 0;i<expression.length() ;i++){
            char ch = expression.charAt(i);
            if(ch == '+' || ch == '-' || ch == '*'){
                String left = expression.substring(0,i);
                String right = expression.substring(i+1);
                List<Integer> leftAns = diffWaysToCompute(left);
                 List<Integer> rightAns = diffWaysToCompute(right);

                for(int l : leftAns){
                    for(int r : rightAns){
                        if(ch == '+')ans.add(l+r);
                        else if(ch == '*')ans.add(l*r);
                        else if(ch =='-')ans.add(l-r);
                    }
                }
            }
        }
        if(ans.isEmpty()){
            ans.add(Integer.parseInt(expression));
        }
        return ans;
    }
}