class Solution {
    public int longestValidParentheses(String s) {
        int left = 0;
        int right = 0;
        int max = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) =='('){
                left++;
            }else{
                right++;
            }
            if(left == right){
                max = Math.max(max , left*2);
            }
            else if(right > left){
                right = 0;
                left = 0;
            }
        }

        left = right = 0;
        for(int i = s.length() - 1 ; i >= 0;i--){
             if(s.charAt(i) =='('){
                left++;
            }else{
                right++;
            }
            if(left == right){
                max = Math.max(max , left*2);
            }
            else if( left > right){
                right = 0;
                left = 0;
            }
        }
        return max;
    }
}


// other Solution Using Stack

 class Solution {
    public int longestValidParentheses(String s) {
       Stack<Integer> st = new Stack<>();
       st.push(-1);
       int max = 0;
       for(int i = 0; i < s.length();i++){
        if(s.charAt(i)=='('){
            st.push(i);
        }else{
            st.pop();
            if(st.isEmpty()){
                st.push(i);
            }else{
                max = Math.max(max , i - st.peek());
            }
        }
       }
       return max;
    }
}
