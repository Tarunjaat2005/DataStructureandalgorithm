class Solution {
    public int maxArea(int[] h) {
        // l = left side , r = right side , h = height mA = maxArea
        int mA = 0 , l = 0 , r = h.length-1;

       while( l  < r){
        int currentArea = ((r - l) * Math.min(h[l] , h [r]));
        mA = Math.max(mA , currentArea);
        if(h[l]< h[r]){
            l++;
        }else{
            r--;
        }
       }
       return mA;
    }
}