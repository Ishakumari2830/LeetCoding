class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] ans = new int[n];
        for(int i = 0;i<ans.length;i++){
             if (k > 0) {
                for (int j = i + 1; j < i + 1 + k; j++) {
                    ans[i] += code[j % n];
                }
            } else if (k < 0) {
                for (int j = i - 1; j > i - 1 - Math.abs(k); j--) {
                    ans[i] += code[((j % n) + n) % n];
                }
            }
        }
        
        return ans;
    }
}