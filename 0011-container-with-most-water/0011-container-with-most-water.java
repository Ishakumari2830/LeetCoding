class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int maxi = Integer.MIN_VALUE;
        int i =0,j = n-1;
        while(i<j){
            maxi = Math.max(maxi , (Math.min(height[j],height[i]) * (j-i)));

            if(height[i] < height [j])i++;
            else j--;
        }
        return maxi;
    }
}