class Solution {
    public char kthCharacter(int k) {
        StringBuilder sb = new StringBuilder();
        sb.append('a');
        while(sb.length() < k){
            StringBuilder local = new StringBuilder();
            String temp = sb.toString();
            for(char i : temp.toCharArray()){
                local.append((char)(i+1));

            }
            sb.append(local);

        }
        return sb.charAt(k-1);
    }
}