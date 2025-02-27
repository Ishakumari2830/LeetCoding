class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int n = arr.length ;
        HashSet<Integer> st = new HashSet<>();
        for(int num : arr){
            st.add(num);
        }

        int maxi = 0;
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                int prev = arr[j];
                int curr = arr[i]+arr[j];
                int len = 2;

                while(st.contains(curr)){
                    int temp = curr;
                    curr += prev;
                    prev = temp;
                    maxi = Math.max(maxi,++len);
                }
            }
        }
        return maxi;


    }
}