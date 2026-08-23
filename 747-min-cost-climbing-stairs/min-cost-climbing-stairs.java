class Solution {
    int[] dp;
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        dp = new int[n + 1];
        Arrays.fill(dp , -1);
        return Math.min(minCost(0 , cost) , minCost(1 , cost));
    }
    public int minCost(int i , int[] cost){
        if(i >= cost.length) return 0;
        if(dp[i] != -1) return dp[i];
        int oneStep = minCost(i + 1 ,  cost);
        int twoStep = minCost(i + 2 , cost);
        dp[i] = cost[i] + Math.min(oneStep , twoStep);
        return dp[i];
    }
}