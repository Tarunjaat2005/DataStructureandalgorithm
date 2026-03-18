class Solution {
    public int[] productExceptSelf(int[] nums) {
        // Brute force approach
    //   int ans[] = new int[nums.length];
    //   for(int i = 0 ; i < nums.length ;i++){
    //     int product = 1;
    //     for(int j = 0 ; j < nums.length ;j++){
    //         if(i != j){
    //             product *= nums[j];
    //         }
    //     }
    //     ans[i] = product;
    //   }
    //   return ans;



    // better approach using divide with handle corner cases
    
    // int n = nums.length;
    // int ans[] = new int[n];
    // int totalProduct = 1;
    // int zeroCount = 0;

    // for( int num : nums){
    //     if(num == 0){
    //         zeroCount++;
    //     }
    //     else{
    //         totalProduct = totalProduct * num;
    //     }
    // }

    // for(int i = 0 ; i < nums.length; i++){
    //     if(zeroCount > 1){
    //         ans[i] = 0;
    //     }else if( zeroCount == 1){
    //         ans[i] = (nums[i] == 0) ? totalProduct : 0;
    //     }else{
    //         ans[i] = totalProduct / nums[i];
    //     }

    // }
    // return ans;



    // more better approach but taking too much space 0(n) space but we can also provide this before moving optimal approach

    // int n = nums.length;
    // int left[]  = new int[n];
    // int right[] = new int[n];
    // int result[] = new int [n];
    // // here we count left side product before i
    // //left[i] stores product of all elements before index i
    // left[0] = 1;
    // for(int i  = 1 ;i < nums.length ; i++){
    //     left[i] = left[i -1] * nums[i - 1];
    // }
    // // here we count right side product after i
    // // right[i] stores product of all elements after index i
    // right[n - 1] = 1;
    // for(int i = n - 2 ; i >= 0 ; i--){
    //     right[i] = right[i + 1] * nums[i + 1];
    // }
    // // final result after multiply both left* right

    // for(int i = 0 ; i < nums.length; i++){
    //     result[i] = left[i] * right[i];
    // }
    // return result;


    // best approach ever no extra space
    int n = nums.length;
    int result[] = new int[n];
    result[0] = 1;
    for(int i = 1 ; i < n ; i++){
        result[i] = result[i - 1] * nums[i - 1];
    }
    int rightProduct = 1;
    for(int i = n - 1 ; i >= 0 ;i--){
        result[i] = result[i] * rightProduct;
        rightProduct  = rightProduct * nums[i];
    }

    return result;


    }
}