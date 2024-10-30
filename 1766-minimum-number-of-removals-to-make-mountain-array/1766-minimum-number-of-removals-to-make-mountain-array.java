class Solution {
    public int minimumMountainRemovals(int[] nums) {
        int n = nums.length;
        List<Integer> lis = lislength(nums);
        int[] rev = new int[n];
        for(int i =0;i<n;i++){
            rev[i] = nums[n - 1 - i];
        }
        List<Integer> lds = lislength(rev);
        Collections.reverse(lds);
        int removal = Integer.MAX_VALUE;
        for(int i =0;i<n;i++){
            if(lis.get(i) > 1 && lds.get(i)>1){
                removal = Math.min(removal, n+1 - lis.get(i) - lds.get(i));
            }
        }
        return removal;

    }

    private List<Integer> lislength(int[] nums){
        List<Integer> lis = new ArrayList<>();
        lis.add(nums[0]);
        List<Integer> lislen = new ArrayList<>();
        for(int i =0;i< nums.length;i++){
            lislen.add(1);
        }
        for(int i = 1;i<nums.length;i++){
            if(nums[i] > lis.get(lis.size()-1)){
                lis.add(nums[i]);
            }
            else
            {
                int ind = Collections.binarySearch(lis,nums[i]);
                if(ind < 0){
                    ind = -(ind + 1);
                }
                lis.set(ind,nums[i]);

            }
            lislen.set(i,lis.size());
        }
        return lislen;

    }
}