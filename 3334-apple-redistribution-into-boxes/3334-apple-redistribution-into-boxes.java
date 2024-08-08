class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
       Arrays.sort(apple);
       Arrays.sort(capacity);
       int sum = 0;
       for(int i=0;i<apple.length;i++){
        sum =sum + apple[i];

       } 
       int i = capacity.length-1;
       int count =0;
       while (i >= 0) {
        if (capacity[i] >= sum) {
            return count + 1;  // +1 because the current box can hold the apples
        } else {
            count++;
            sum -= capacity[i];  // Reduce the remaining capacity needed
            i--;  // Move to the next largest box
        }
    }
    return -1;
    }
}