class Solution {
      private void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i]= nums[j];
        nums[j]= temp;
    }
    private void reverse(int[] nums ,int start){
        int i = start ;
         int j = nums.length-1;
         while(i < j){
            swap(nums,i,j);
            i++;
            j--;
         }
    }
  
    public void nextPermutation(int[] nums) {
        int n = nums.length;
       int findInd = -1;
       for(int i = n-1;i>0;i-- ){
        if(nums[i-1] < nums[i]){
            findInd = i-1;
            break;
        }
       }
       
       if(findInd != -1){
         int swapInd = findInd;
       for(int j = n-1;j>= findInd +1;j--){
        if(nums[j] > nums[findInd]){
            swapInd = j;
            break;
        }
       }
       
       swap(nums, findInd, swapInd);
       }
       reverse(nums, findInd + 1);

    }
}