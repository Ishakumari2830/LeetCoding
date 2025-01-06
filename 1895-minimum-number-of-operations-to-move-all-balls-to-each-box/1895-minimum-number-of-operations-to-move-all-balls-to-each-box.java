class Solution {
    public int[] minOperations(String boxes) {
        //brute force : manually
        // int[] ans = new int[boxes.length()];
        // for(int i = 0;i<boxes.length();i++){
        //     if(boxes.charAt(i)=='1'){
        //         for(int j = 0;j<boxes.length();j++){
        //             ans[j] += Math.abs(j-i);
        //         }
        //     }
        // }
        // return ans;

        //optimized : prefix sum
        int n = boxes.length();
        int[] ans = new int[boxes.length()];
        int cumValue = 0;
        int cumSum = 0;

        for(int i = 0;i<n;i++){
            ans[i]=cumSum;
            cumValue += boxes.charAt(i)=='0'?0:1;
            cumSum += cumValue;

      }
      cumValue = 0;
     cumSum = 0;

       for(int i = n-1;i>=0;i--){
            ans[i] +=cumSum;
            cumValue += boxes.charAt(i)=='0'?0:1;
            cumSum += cumValue;

      }
      return ans;
    }

}