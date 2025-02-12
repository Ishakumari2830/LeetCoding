class Solution {
    private int digitSum(int num){
        int digit = 0;
        while (num >  0){
            digit += num % 10;
            num = num / 10;
        }
        return digit;
    }
    public int maximumSum(int[] nums) {
        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();

       
        for (int num : nums) {
            int Sum = digitSum(num);
            map.putIfAbsent(Sum, new PriorityQueue<>(Collections.reverseOrder()));
            map.get(Sum).add(num);
        }

        int maxPairSum = -1;

        for (PriorityQueue<Integer> pq : map.values()) {
            if (pq.size() > 1) {
                int first = pq.poll();
                int second = pq.poll();
                maxPairSum = Math.max(maxPairSum, first + second);
            }
        }

        return maxPairSum;
    }
}