class Solution {
    static int[] dp;
    public int rob(int[] nums) {
        int n = nums.length;
        dp = new int[n];
        Arrays.fill(dp , -1);
        return loot(0 , nums);
    }
    public int loot(int i , int[] nums){
        if(i >= nums.length) return 0;
        if(dp[i] != -1) return dp[i];
        int take  = nums[i] + loot(i+2 , nums);
        int Ntake = loot(i + 1 , nums);
        return dp[i] = Math.max(take , Ntake);
    }
}