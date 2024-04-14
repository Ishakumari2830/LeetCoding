import java.util.Scanner;

class Solution {
    public int reverse(int x)
    {
        
        if(x==0)
            return 0;
        long r=0;
        while(x!=0)
        {
            int LD = x%10;
            r= r*10+LD;
            x=x/10;
        }
        System.out.println(r);
        
        
        if(r > (Integer.MAX_VALUE) || r < (Integer.MIN_VALUE)) {
        return 0;
        }
        else
          
            return (int)r;

       
    }
}