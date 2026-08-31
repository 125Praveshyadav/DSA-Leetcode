class Solution {
    // Boolean[][] dp;
    // public boolean canPartition(int[] nums) {
    //     int n = nums.length;
    //     int total = 0;
    //     for(int num : nums){
    //         total += num;
    //     }
    //     //odd number aa gya agr total to do part me equal divide hona impossible hai
    //     if(total % 2 != 0){
    //         return false;
    //     }
    //     int target = total /2;
    //     dp = new Boolean[n][target+1];

    //     return solve(0 , target , nums); 
    // }
    // public boolean solve(int i , int target , int[] nums){
    //     if(target == 0) return true;
    //     if(i == nums.length) return false;

    //     if(dp[i][target] != null){
    //         return dp[i][target];
    //     }
    //     boolean take = false;
    //     if(nums[i] <= target){
    //         take = solve(i + 1 , target - nums[i] , nums);
    //     } 
    //     boolean skip = solve( i + 1 , target  ,nums);
    //     dp[i][target] = take || skip;
    //     return dp[i][target] ;
    // }



     public boolean canPartition(int[] nums) {
        int n = nums.length;
        int total = 0;
        for(int num : nums){
            total += num;
        }
        if(total % 2 != 0) return false;
        int target = total /2;
        boolean[][] dp = new boolean[n + 1][ target + 1];
        //sum = 0 pr always true hoga
        for(int i = 0 ; i < n + 1 ; i++){
            dp[i][0] = true;
        }
        // 0 items ke liye always false
        for(int i = 1 ; i < target + 1 ; i++){
            dp[0][i] = false;
        }

        for(int i = 1 ; i < n + 1 ; i ++){
            for(int sum = 1 ; sum < target + 1 ; sum++){
                //include
                if(nums[i-1] <= sum){//take kr skate hai
                    boolean take = dp[i-1][sum - nums[i-1]];
                    boolean skip = dp[i-1][sum];
                    dp[i][sum] = take || skip;
                }else {//exclude
                    dp[i][sum] = dp[i-1][sum];
                }
            }
        }
        return dp[n][target];
     }
}