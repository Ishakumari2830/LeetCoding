class Solution {
   public int binarySearch(int[] potions , int spell ,long success){
    //Arrays.sort(potions);
     int n = potions.length;
     int l = 0;
     int r = n-1;
     while(l <= r){
        int mid = l + (r-l)/2;
        if((long)potions[mid] * spell >= success){
            r = mid -1;
        }
        else l = mid +1;
     }
     return r;

   }
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n = potions.length;
        int[] count = new int[spells.length];
        int cnt = 0;
        for(int i = 0;i < spells.length;i++){
           int spell = spells[i];
           cnt =   n -1- binarySearch(potions , spell , success);
           count[i] = cnt;
        }
        return count;

    }
}