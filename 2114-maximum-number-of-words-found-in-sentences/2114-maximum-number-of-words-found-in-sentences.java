class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxlen = 0 ;
        for(String currsen : sentences){
            int k = 1;
        for(char c : currsen.toCharArray()){
            if(c== ' '){
                k++;
            }

        }
        if(k > maxlen){
            maxlen = k ;
        }
        }
        return maxlen;
    }
}