class Solution {
    public int[] twoSum(int[] numbers, int target) {
       
        int[] ans = new int[2];
        int l = 0;
        int r = numbers.length-1;
        while(numbers[l] + numbers[r] != target){
            if(numbers[l] + numbers[r] < target){
                l++;
            }
            else r--;
        }
        ans[0]=l+1;
        ans[1]=r+1;
        return ans;
    }
}