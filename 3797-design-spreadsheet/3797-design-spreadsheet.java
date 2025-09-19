class Spreadsheet {

    int[][] grid;
    int[] row;

    private int[] getPosition(String s){
        int col = s.charAt(0)-'A'; 
        int row = Integer.parseInt(s.substring(1))-1;//making it 0 based
        return new int[]{row,col};
    }

    public Spreadsheet(int rows) {
    
       // this.row = row;
        this.grid = new int[rows][26];

    }
    
    public void setCell(String cell, int value) {
        int[] pos = getPosition(cell);
        grid[pos[0]][pos[1]] = value;

    }
    
    public void resetCell(String cell) {
        int[] pos = getPosition(cell);
        grid[pos[0]][pos[1]] = 0;
        
    }
    
    public int getValue(String formula) {
        if(!formula.startsWith("=")){
            return Integer.parseInt(formula);
        }

        String[] parts = formula.substring(1).split("\\+");//["5" , "7", "A1"]
        int sum  = 0;
        for(String operand : parts){
            if(Character.isDigit(operand.charAt(0))){
                sum += Integer.parseInt(operand);
            } else{
                int col = operand.charAt(0)-'A';
                int row = Integer.parseInt(operand.substring(1)) -1;
                sum += grid[row][col];

            }

        }
        return sum;


    }
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */