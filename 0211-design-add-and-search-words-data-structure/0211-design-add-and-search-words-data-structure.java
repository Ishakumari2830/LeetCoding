class WordDictionary {
    List<String> words;

    public WordDictionary() {
        this.words = new ArrayList();
    }
    
    public void addWord(String word) {
        words.add(word);
    }
    
    public boolean search(String word) {
        for(String aWord: words){
            if(word.length() != aWord.length())continue;
            boolean flag = true;
            for(int i = 0;i<word.length();i++){
                if((word.charAt(i) != aWord.charAt(i) ) && (word.charAt(i) != '.') ){
                    flag = false;
                    break;

                }
            }
            if(flag)return true;
            
        }
        return false;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */