class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
       int[] sorted = new int[nums.length];
       for(int i = 0;i<nums.length;i++){
        sorted[i]= nums[i];
       }
       Arrays.sort(sorted);

       int grp = 0;
       HashMap<Integer,Integer> numGroup = new HashMap<>();
       numGroup.put(sorted[0],grp);
       HashMap<Integer,LinkedList<Integer>> list = new HashMap<>();
       list.put(grp, new LinkedList<Integer>(Arrays.asList(sorted[0])));

       for(int i = 1;i<nums.length;i++){
        if(Math.abs(sorted[i]-sorted[i-1]) > limit){
            grp++;//new grp
        }
        numGroup.put(sorted[i],grp);

        if(!list.containsKey(grp)){
            list.put(grp,new LinkedList<Integer>());
        }
        list.get(grp).add(sorted[i]);
       }

       for(int i =0;i<nums.length;i++){
        int num = nums[i];
        int g= numGroup.get(num);
        nums[i]= list.get(g).pop();
       }
       return nums;
    }
}