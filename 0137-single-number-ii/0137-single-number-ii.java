class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int k = 0;k<=31;k++){
            int temp = (1<<k);//kth bit set or not
            int cntOne = 0;
            int cntZero = 0;
            for(int num:nums){
                if((num & temp)==0)cntZero++;
                else cntOne++;
            }

            if(cntOne %3 == 1){
                res= (res| temp);
            }
        }
        return res;
    }
}