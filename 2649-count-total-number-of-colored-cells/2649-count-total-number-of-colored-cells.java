class Solution {
    public long coloredCells(int n) {
        //1 + 4+ 8+ 12+16
        long blue = 1;
        long add = 4;
        for(int i = n;i>1;i--){
            blue += add;
            add += 4;
        }
        return blue;
    }
}