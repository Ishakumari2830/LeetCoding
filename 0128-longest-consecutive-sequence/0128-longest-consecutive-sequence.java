class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n == 0)return 0;
        int maxi = 1;
        Set<Integer> st = new HashSet<>();
        for(int num : nums ){
            st.add(num);
        }

        for(int i : st){
            if(!st.contains(i-1)){
                int cnt = 1;
                int x = i;
                while(st.contains(x +1)){
                    cnt++;
                    x = x+1;
                }
                 maxi = Math.max(maxi , cnt);
            }
           
        }
        return maxi;
    }
}