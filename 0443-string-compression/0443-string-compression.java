class Solution {
    public int compress(char[] chars) {
    int ind = 0;
    int i = 0;
     while(i < chars.length){
        char currchar = chars[i];
        int count = 0;
        while(i < chars.length && chars[i] == currchar){
            count++;
            i++;
        }
        chars[ind++] = currchar;
        if(count > 1){
            for(char c : Integer.toString(count).toCharArray()){
                chars[ind++] = c;
            }
        }
     }
     return ind;
    }
}