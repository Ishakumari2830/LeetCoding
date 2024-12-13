class Solution {
   private int solve(List<Integer> temp, int x) {
        int sum = 0;
        Map<Integer, Integer> mpp = new HashMap<>();

        for (int num : temp) {
            mpp.put(num, mpp.getOrDefault(num, 0) + 1);
            sum += num;
        }

        int mapSize = mpp.size();
        if (mapSize < x) {
            return sum; 
        }

      
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> 
            b[0] != a[0] ? b[0] - a[0] : b[1] - a[1]
        );

        for (Map.Entry<Integer, Integer> entry : mpp.entrySet()) {
            pq.add(new int[]{entry.getValue(), entry.getKey()});
        }

        sum = 0;

      
        while (x-- > 0 && !pq.isEmpty()) {
            int[] element = pq.poll();
            int freq = element[0];
            int value = element[1];
            sum += value * freq;
        }

        return sum;
    }
    public int[] findXSum(int[] nums, int k, int x) {
     int n = nums.length;
    int[] ans = new int[n - k + 1];

   
    for (int i = 0; i <= n - k; i++) {
        List<Integer> temp = new ArrayList<>();
        for (int j = i; j < i + k; j++) {
            temp.add(nums[j]);
        }

        int res = solve(temp, x);
        ans[i] = res; 
    }

    return ans; 
       
    }
}