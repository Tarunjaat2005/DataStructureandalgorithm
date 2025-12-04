class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxlen = 0 ;
        for(String currsen : sentences){
            int currlen = currsen.split(" ").length;
            if(currlen > maxlen){
                maxlen = currlen;
            }
        }
        return maxlen;
           
    }
}