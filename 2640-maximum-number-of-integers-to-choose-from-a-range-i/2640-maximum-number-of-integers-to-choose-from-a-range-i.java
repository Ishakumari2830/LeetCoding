class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
       HashSet<Integer> st = new HashSet<>();
      for(int num : banned){
        st.add(num);
      }
        int cnt = 0;
        int sum = 0;
        for(int i = 1;i<=n;i++){
           
                if (st.contains(i))continue;
               
               
                if(sum  + i > maxSum)break;
                 sum = sum + i;
                cnt++;
                 }
        
        return cnt;
    }
}