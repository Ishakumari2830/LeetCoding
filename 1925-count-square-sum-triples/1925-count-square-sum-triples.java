class Solution {
    private boolean isValid(int a,int b , int c){
        return (c*c == (a*a + b*b));
    }
    public int countTriples(int n) {
        int cnt = 0;
        for(int i = 1;i<= n ;i++){
            for(int j = 1 ; j<= n ;j++){
                for(int k = 1 ;k<= n ;k++){
                    if(isValid(i,j,k))cnt++;
                }
            }
        }
        return cnt;
    }
}