class Solution {
    public int minimumPushes(String word) {
        HashMap<Character,Integer> mpp = new HashMap<>();
        for(char l : word.toCharArray()){
           
                mpp.put(l,mpp.getOrDefault(l,0)+1);

            
           
        }
        ArrayList<Integer> value = new ArrayList<>();
        for(int key:mpp.values()){
            value.add(key);
        }
        Collections.sort(value, Collections.reverseOrder()); 
        int count =1,i=1;
        int res =0;
        for(int x: value){
            if(i>8){
                count++;
                i=1;
            }
            res += count*x;
            i++;
        }
        return res;

    }
}