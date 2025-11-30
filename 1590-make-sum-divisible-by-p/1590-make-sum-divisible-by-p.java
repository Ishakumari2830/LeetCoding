class Solution {
    public int minSubarray(int[] nums, int p) {
        long sum = 0 ;
        for(int num : nums){
            sum += num;

        }
        int need = (int)(sum % p);
        if (need == 0) return 0;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); 
        long prefix = 0;
        int result = nums.length;

        for (int i = 0; i < nums.length; i++) {
            prefix = (prefix + nums[i]) % p;

            int target = (int)((prefix - need + p) % p);

            if (map.containsKey(target)) {
                result = Math.min(result, i - map.get(target));
            }

            
            map.put((int)prefix, i);
        }

        return result == nums.length ? -1 : result;
    }
}