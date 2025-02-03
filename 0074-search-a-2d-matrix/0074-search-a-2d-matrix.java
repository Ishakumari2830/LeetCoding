class Solution {
    private  boolean BinarySearch(int[] nums,int l, int h,int target){
       
        while(l<= h){
             int mid = l+(h-l)/2;
            if(nums[mid]== target)return true;
            else
            if(target < nums[mid]){
                h = mid-1;
            }
             else
            if(target > nums[mid]){
                l = mid+1;
            }

        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i = 0;i<n;i++){
           if( matrix[i][m-1] < target )continue;
            return BinarySearch(matrix[i], 0, m - 1, target);
        
        }
        return false;
    }
}