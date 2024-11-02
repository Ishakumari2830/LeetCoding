class pair{
    String first;
    int sec;
    pair(String _first, int _sec){
        this.first = _first;
        this.sec = _sec;
    }
}
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(beginWord, 1));
        Set<String> s = new HashSet<>();
        int len = wordList.size();
        for(int i = 0;i < len;i++){
            s.add(wordList.get(i));
        }
        s.remove(beginWord);
        while(!q.isEmpty()){
            String word = q.peek().first;
            int step = q.peek().sec;
            q.remove();
            if(word.equals(endWord)== true)return step;
            //word : hat
            for(int i = 0;i< word.length();i++){
                for(char c = 'a'; c <= 'z'; c ++){
                    char[] replacedChar = word.toCharArray();
                    replacedChar[i]=c;
                    String replaceword = new String(replacedChar);//new word = aat..
                    if(s.contains(replaceword)== true){
                        s.remove(replaceword);
                        q.add(new pair(replaceword,step+1));
                    }
                }
            }
        }
        return 0;
    }
}