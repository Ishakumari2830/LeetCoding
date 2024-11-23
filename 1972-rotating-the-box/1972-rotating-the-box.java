class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int r = box.length;
        int c = box[0].length;
        char[][] ans = new char[c][r];
       for(int i = 0;i<r;++i){
        int emp = c-1;//last element of row
        for(int j = c-1;j>=0;--j){
            if(box[i][j]== '*')//obstacle
            {
                emp = j-1;
            } 
            if(box[i][j]=='#'){
                box[i][j]='.';
                box[i][emp] = '#';
                --emp;
            }


        }

       }
       for(int i =0;i<r;++i){
        for(int j = c-1;j>=0;--j){
            ans[j][r-i-1] = box[i][j];
        }
       }
       return ans;
    }
}