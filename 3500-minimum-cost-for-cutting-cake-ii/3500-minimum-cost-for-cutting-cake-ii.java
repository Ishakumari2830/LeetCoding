class Solution {
    public long minimumCost(int m, int n, int[] horizontalCut, int[] verticalCut) {
         Arrays.sort(horizontalCut);
        Arrays.sort(verticalCut);
        
        int i = horizontalCut.length - 1;
        int j = verticalCut.length - 1;
        
        int horizontalPieces = 1; // Initially there is one horizontal piece
        int verticalPieces = 1; // Initially there is one vertical piece
        
        long totalCost = 0;
        
        while (i >= 0 && j >= 0) {
            if (horizontalCut[i] >= verticalCut[j]) {
                totalCost += horizontalCut[i] * verticalPieces;
                horizontalPieces++;
                i--;
            } else {
                totalCost += verticalCut[j] * horizontalPieces;
                verticalPieces++;
                j--;
            }
        }
        
        while (i >= 0) {
            totalCost += horizontalCut[i] * verticalPieces;
            i--;
        }
        
        while (j >= 0) {
            totalCost += verticalCut[j] * horizontalPieces;
            j--;
        }
        
        return totalCost;
    }
}