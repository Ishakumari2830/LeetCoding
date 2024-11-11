class Solution {
    public boolean checkPrime(int x) {
        if (x <= 1) return false;
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean primeSubOperation(int[] nums) {
        List<Integer> primes = new ArrayList<>();
        for(int i = 2;i<=1000;i++){
            if(checkPrime(i))primes.add(i);

        }
        int n = nums.length;
       int[] new_nums = new int[n];
       Arrays.fill(new_nums, -1);
       new_nums[n-1]=nums[n-1];
       for(int i = n-2;i>=0;i--){
        if(nums[i]<new_nums[i+1]){
            new_nums[i]=nums[i];
            continue;
        }
        //else
        for(int p : primes){
            if(p>=nums[i]){
                new_nums[i]= nums[i];
                break;
            }
            if(nums[i] -p < new_nums[i+1]){
                new_nums[i]=nums[i]-p;
                break;
            }
        }
       }
       for(int i = 1;i<n;i++){
        if(new_nums[i]<=new_nums[i-1])return false;
       }
       return true;



    }
}