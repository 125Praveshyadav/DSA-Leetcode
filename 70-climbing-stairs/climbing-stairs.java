class Solution {
    int[] dp;
    public int climbStairs(int n) {
        dp = new int[n + 1];
        return ways(n);     
    }
    public int ways(int n){
        if(n <= 2) return n;
        if(dp[n] != 0) return dp[n];
        dp[n] = ways(n - 1) + ways(n - 2);
        return dp[n];
    }
}
