class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length;
        int[] expand = new int[n +k -1];
        for(int i = 0 ;i<n;i++){
            expand[i]=colors[i];
        }
        for(int i = 0;i<k -1;i++){
            expand[n +i]=colors[i];

        }
        int len = expand.length;
        int cnt = 0;
        int l = 0,r =1;
        while(r < len){
            if(expand[r]==expand[r-1]){
                l = r;//pattern break,restart
                r++;
                continue;

            }
            r++;
            if(r-l <k)continue;
            cnt++;
            l ++;
        }
        return cnt;
    }
}