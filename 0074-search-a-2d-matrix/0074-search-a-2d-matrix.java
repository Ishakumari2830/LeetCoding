class Solution { 
    public boolean binarySearch(int[] nums, int target){
       int l = 0;
       int n = nums.length;
       int r = n-1;
       while(l<=r){
        int mid = l + (r-l)/2;
        if(nums[mid]== target)return true;
        if(nums[mid] > target){
            r = mid -1;
        } else l = mid +1;
       }
       return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i = 0;i<n;i++){
            if(matrix[i][m-1]  <target)continue;
            return binarySearch(matrix[i] , target);
        }
        return false;
    }
}