class Solution {
    Boolean[][] dp;
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int total = 0;
        for(int num : nums){
            total += num;
        }
        //odd number aa gya agr total to do part me equal divide hona impossible hai
        if(total % 2 != 0){
            return false;
        }
        int target = total /2;
        dp = new Boolean[n][target+1];

        return solve(0 , target , nums); 
    }
    public boolean solve(int i , int target , int[] nums){
        if(target == 0) return true;
        if(i == nums.length) return false;

        if(dp[i][target] != null){
            return dp[i][target];
        }
        boolean take = false;
        if(nums[i] <= target){
            take = solve(i + 1 , target - nums[i] , nums);
        } 
        boolean skip = solve( i + 1 , target  ,nums);
        dp[i][target] = take || skip;
        return dp[i][target] ;
    }
}