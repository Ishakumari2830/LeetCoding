class Solution {
    private boolean isSet(int x,int bit){
        return (x & (1<<bit)) != 0;
    }
    private int setBit(int x,int bit){
        return x | (1<<bit);
    }
     private int unsetBit(int x,int bit){
        return x & (~(1<<bit));
    }
    
    public int minimizeXor(int num1, int num2) {
        int x = num1;
        int reqSetCount = Integer.bitCount(num2);
        int currSetCount = Integer.bitCount(x);

        int bit = 0;

        if(currSetCount < reqSetCount){
            while(currSetCount < reqSetCount){
                 if(!isSet(x,bit)){
                   x = setBit(x,bit);
                    currSetCount++;
                 }
                 bit++;
            }
        } else if(currSetCount > reqSetCount){
            while(currSetCount > reqSetCount){
                if(isSet(x,bit)){
                    x= unsetBit(x,bit);
                    currSetCount--;
                }
                bit++;
            }
        }

      return x;
    
    }
}