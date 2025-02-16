class Solution {
    private int[] res ;
    public int[] constructDistancedSequence(int n) {
       int[] arr = new int[(n*2)-1];
       boolean[] isUsed = new boolean[n+1];
       backtrack(n,0,arr,isUsed);
       return res;
        
    }
    private boolean backtrack(int n , int l , int[] arr , boolean[] isUsed){
        if(l == arr.length){
            res = arr.clone();
            return true;
        }
        if(arr[l] != 0)return backtrack(n,l+1,arr,isUsed);

        for(int i = n;i>= 1;i--){
            if(isUsed[i])continue;
            int r = (i == 1) ? l : l+i;
            if(r < arr.length && arr[r]==0){
                arr[l] = i;
                arr[r]=i;
                isUsed[i] = true;
                if(backtrack(n,l+1,arr,isUsed))return true;
                arr[l]=0;
                arr[r]=0;
                isUsed[i] = false;
            }
            
        }
        return false;
    }
}