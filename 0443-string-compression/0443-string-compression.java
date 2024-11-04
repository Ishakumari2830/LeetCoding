class Solution {
    public int compress(char[] chars) {
        int index = 0;
     int i = 0;
     while(i < chars.length){
        char currchar = chars[i];
        int count = 0;
        while(i < chars.length && chars[i] == currchar){
            count++;
            i++;
        }
        chars[index++] = currchar;
        if(count > 1){
            for(char c : Integer.toString(count).toCharArray()){
                chars[index++] = c;
            }
        }
     }
     return index;
    }
}