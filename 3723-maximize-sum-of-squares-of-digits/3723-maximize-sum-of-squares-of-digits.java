class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(sum > 9 * num){
            return "";

        }
        int r = sum % 9;
        StringBuilder ans = new StringBuilder();
        int div = sum /9;
        for(int i = 0;i< div ;i++){
            ans.append('9');
        }
        if(r > 0){
            ans.append((char) ('0' + r));

        }
        int zero = num - ans.length();
        for(int i = 0;i<zero ;i++){
            ans.append('0');

        }
        return ans.toString();

    }
}