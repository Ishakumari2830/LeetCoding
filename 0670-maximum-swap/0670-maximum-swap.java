class Solution {
    public int maximumSwap(int num) {
        String str = String.valueOf(num);//converting num to string
       int[] arr = new int[str.length()];
       for(int i=0;i<arr.length;i++){
        arr[i]= str.charAt(i) -'0';
       }
      
       for (int i = 0; i < arr.length; i++) {
           
            int maxIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
               
                if (arr[j] >= arr[maxIdx]) {
                    maxIdx = j;
                }
            }
            
           
            if (arr[maxIdx] != arr[i]) {
                int temp = arr[i];
                arr[i] = arr[maxIdx];
                arr[maxIdx] = temp;
                break;  
            }
        }

       
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result = result * 10 + arr[i];  
        }

        return result;
        

    }
}