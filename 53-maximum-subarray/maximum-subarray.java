class Solution {
    public int maxSubArray(int[] nums) {
        // int max = Integer.MIN_VALUE;
        //  int currSum = 0;
        // for(int i = 0 ; i < nums.length ; i++){
        //      currSum += nums[i];
        //      max = Math.max(currSum , max);
        //      if(currSum < 0) currSum = 0;
        // }
        // return max;

        int max = nums[0];
        int currSum = nums[0];
        
        for(int i = 1 ;i < nums.length ; i++){
            currSum = Math.max(nums[i] , currSum + nums[i]);
            max = Math.max(currSum , max);
        }
        return max;
    }
}