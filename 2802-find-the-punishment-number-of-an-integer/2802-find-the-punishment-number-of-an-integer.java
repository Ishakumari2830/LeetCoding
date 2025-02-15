class Solution {
    private boolean candivide(String str, int target){
        if(str.isEmpty() && target == 0)return true;
        if(target < 0)return false;
        for(int i = 0;i<str.length();i++){
           String l = str.substring(0,i+1);
           String r = str.substring(i+1);
           int num = Integer.parseInt(l);

           if(candivide(r,target-num))return true;
        }
        return false;
    }
    public int punishmentNumber(int n) {
        int num = 0;
        for(int i = 1;i<=n;i++){
            int sq = i*i;
            if(candivide(Integer.toString(sq),i)){
                num += sq;
            }
        }
        return num;
    }
}