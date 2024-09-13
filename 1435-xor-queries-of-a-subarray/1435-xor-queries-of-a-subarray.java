class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] pre = new int[arr.length];
        pre[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            pre[i]=pre[i-1]^arr[i];
        }
        int[] res = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int first = queries[i][0];
            int sec = queries[i][1];
            if(first == 0){res[i]=pre[sec];}
            // else
            // if(first== sec){
            //     res[i]=arr[i];
            // }
            else
            {
                res[i]=pre[first-1]^pre[sec];
            }

        }
        return res;
    }
}