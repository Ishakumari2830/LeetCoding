class Solution {
     private int[][] longestCommonSubsequenceDP(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int[][] t = new int[m+1][n+1];
        for(int i =0;i<=m ;i++){
            for(int j =0;j<=n;j++){
                if(i==0 || j== 0) {
                    t[i][j] = 0;
                }
            }
        }
        for(int i = 1; i <= m ; i++) {
            for(int j = 1; j <= n ; j++) {
                if(text1.charAt(i-1) == text2.charAt(j-1)) {
                    t[i][j] = 1 + t[i-1][j-1]; 
                } else {
                    t[i][j] = Math.max(t[i-1][j], t[i][j-1]); 
                }
            }
        }
        return t; 
    }
    public String shortestCommonSupersequence(String str1, String str2) {
       int m = str1.length();
        int n = str2.length();

        
        int[][] t = longestCommonSubsequenceDP(str1, str2);

       
        StringBuilder sb = new StringBuilder();
        int i = m, j = n;

        while(i > 0 && j > 0) {
            if (str1.charAt(i-1) == str2.charAt(j-1)) {
                
                sb.append(str1.charAt(i-1));
                i--;
                j--;
            } else if (t[i-1][j] > t[i][j-1]) {
                
                sb.append(str1.charAt(i-1));
                i--;
            } else {
            
                sb.append(str2.charAt(j-1));
                j--;
            }
        }

       
        while(i > 0) {
            sb.append(str1.charAt(i-1));
            i--;
        }
        while(j > 0) {
            sb.append(str2.charAt(j-1));
            j--;
        }

       
        return sb.reverse().toString();
}
}