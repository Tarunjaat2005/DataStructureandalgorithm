class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        // for(int i = 0 ; i < nums.length ; i++){
        //     for(int j = i + 1 ; j < nums.length ; j++){
        //         if(nums[i] == nums[j]){
        //             cnt++;
        //         }
        //     }
        // }
        // return cnt;

        int[] freq = new int[101];
        for(int x : nums){
            count = count + freq[x];
            freq[x] = freq[x] + 1;
        }
        return count;
    }
}