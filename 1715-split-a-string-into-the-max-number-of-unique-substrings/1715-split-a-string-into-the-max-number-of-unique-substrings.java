class Solution {
    int maxCount;
    public int maxUniqueSplit(String s) {
        maxCount =0;
        HashSet<String> set = new HashSet<>();

        backtrack(s,set,0);
        return maxCount;
    }
    private void backtrack(String s, HashSet<String> set,int index){
        //basecase 
        int n = s.length();
        if(index == n){
            maxCount = Math.max(maxCount,set.size());//as set size giving me final length
            return;
        }
        for(int i =index ;i<n;i++){
            String sub = s.substring(index,i+1); // as i+1 is i, excluded lasst one
            if(!set.contains(sub)){
                set.add(sub);
                backtrack(s,set,i+1); //as we already got for i
                set.remove(sub);
            }
        }
    }
}