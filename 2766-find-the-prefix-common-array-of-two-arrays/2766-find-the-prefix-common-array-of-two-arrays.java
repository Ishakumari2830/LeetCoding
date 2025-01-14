class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        // int n = A.length;
        // int[] ans = new int[n];
        // Set<Integer> stA = new HashSet<Integer>();
        // Set<Integer> stB = new HashSet<Integer>();

        // for(int i = 0;i<n;i++){
        //     stA.add(A[i]);
        //     stB.add(B[i]);
        //     int cnt = 0;
        //     for(int a:stA){
        //         if(stB.contains(a))cnt++;
        //     }
        //     ans[i]=cnt;
        // }
        // return ans;

        int n = A.length;
        int[] ans = new int[n];
        int[] freq = new int[n+1];
        int cnt = 0;
        for(int i = 0;i<n;i++){
            if(++freq[A[i]]== 2)cnt++;
             if(++freq[B[i]]== 2)cnt++;
             ans[i]= cnt;

        }
        return ans;


    }

}