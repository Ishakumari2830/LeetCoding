class Solution {
    public int numTilePossibilities(String tiles) {
        Set<String> seq = new HashSet<>();
        int n = tiles.length();
        boolean[] used = new boolean[n];

        genSeq(tiles,"", used,seq);
        return seq.size()-1;
    }
    private void genSeq(String tiles,String curr , boolean[] used,Set<String> seq){
        seq.add(curr);
        for(int i = 0;i<tiles.length() ;i++){
            if(!used[i]){
                used[i] = true;
                genSeq(tiles,curr + tiles.charAt(i), used, seq);
                used[i] =false;
            }
        }
    }
}