class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String s = s1 + " " + s2;
        String[] words = s.split(" ");
        HashMap<String,Integer> mpp = new HashMap<>();
        for(String word : words){
            mpp.put(word,mpp.getOrDefault(word,0)+1);
        }
        ArrayList<String> res = new ArrayList<>();
        for(Map.Entry<String,Integer> entry : mpp.entrySet()){
            if(entry.getValue()==1){
                 res.add(entry.getKey());
            }

        }
        return res.toArray(new String[0]);
    }
}