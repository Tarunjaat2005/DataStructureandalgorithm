class Solution {
    public int mostWordsFound(String[] sentences) {
        int res = 0;
        for(String s : sentences) {
            res = Math.max(countS(s) + 1, res);
        }
        return res;
    }

    private int countS(String s) {
        int res = 0;
        for(int i = 0; i < s.length(); i++) {
            res += s.charAt(i) == ' ' ? 1: 0;
        }
        return res;
    }
}
