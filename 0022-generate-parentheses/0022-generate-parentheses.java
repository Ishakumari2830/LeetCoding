class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        recursive(ans,n,0,0,"");
        return ans;

    }
    private void recursive(List<String> ans , int n ,int left,int right , String s){
        //base cndtn 
        if(s.length() == n*2){
            ans.add(s);
            return;
        }
        if(left < n){
            recursive(ans,n,left +1 ,right, s + '(');
        }
         if(right < left){
            recursive(ans,n,left  ,right + 1, s + ')');
        }
    }
}