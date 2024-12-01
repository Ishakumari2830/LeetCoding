class Solution {
    public int smallestNumber(int n) {
        StringBuilder str = new StringBuilder();
       while(n!=0){
        int mask = (n & 1);
        str.append(mask);
       n =  n>>1;
       }
       return (1 << str.toString().length()) -1; 
  
    }
}