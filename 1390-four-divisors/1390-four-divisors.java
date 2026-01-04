class Solution {
    public int sumFourDivisors(int[] nums) {
       int totalSum = 0;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int count = 0;
            int sum = 0;
            for (int d = 1; d * d <= num; d++) {
                if (num % d == 0) {

                    int d1 = d;
                    int d2 = num / d;
                    if (d1 == d2) {
                        count++;
                        sum += d1;
                    } else {
                        count += 2;
                        sum += d1 + d2;
                    }
                    if (count > 4) {
                        break;
                    }
                }
            }

            if (count == 4) {
                totalSum += sum;
            }
        }

        return totalSum;
    }
}