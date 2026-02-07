class Solution {
    public int minOperations(int[] nums, int k) {
        Arrays.sort(nums);

        int count = 0;
        int i = 0;
        while(nums[i] < k){
            count++;
            i++;

        }
   return count;
        
    }
}