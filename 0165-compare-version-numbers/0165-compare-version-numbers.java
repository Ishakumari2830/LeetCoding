class Solution {
    public int compareVersion(String version1, String version2) {
        String[] token1 = version1.split("\\.");
        String[] token2 = version2.split("\\.");
        //comparision
        int m = token1.length;
        int n = token2.length;
        int i =0;
            while(i<m || i <n){
                int a = i<m ? Integer.parseInt(token1[i]): 0;
                int b = i<n ?Integer.parseInt(token2[i]): 0;
                if(a < b)return -1;
                else if(a > b)return 1;
                else i++;
            }

            return 0;
        


    }
}