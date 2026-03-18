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

    int n = nums.length;
    int ans[] = new int[n];
    int totalProduct = 1;
    int zeroCount = 0;

    for( int num : nums){
        if(num == 0){
            zeroCount++;
        }
        else{
            totalProduct = totalProduct * num;
        }
    }

    for(int i = 0 ; i < nums.length; i++){
        if(zeroCount > 1){
            ans[i] = 0;
        }else if( zeroCount == 1){
            ans[i] = (nums[i] == 0) ? totalProduct : 0;
        }else{
            ans[i] = totalProduct / nums[i];
        }

    }
    return ans;

    }
}