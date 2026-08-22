class Solution {
    static int[] dp;
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        //exclude last element
        dp = new int[n];
        Arrays.fill(dp , -1);
        int case1 = loot(0 , n - 2 , nums);

        //exclude first element kr rahe hai kyu ki lst aur first do no adjusted
        dp = new int[n];
        Arrays.fill(dp , -1);
        int case2 = loot(1 , n - 1 , nums);
        return Math.max(case1 , case2);
    }
    public int loot(int i , int end  , int[] nums){
        if(i > end){
            return 0;
        }
        if(dp[i] != -1) return dp[i];
        int take = nums[i] +  loot(i + 2 , end ,nums );
        int Ntake = loot(i + 1 , end , nums);

        return dp[i] = Math.max(take , Ntake); 
    }
}