class Solution {
    int[][] dp;
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        dp = new int[n + 1][amount + 1];
        for(int i = 0 ; i <= n ; i++){
            Arrays.fill(dp[i] , -1);
        }
       int ans = coin(0, amount, coins);
        if (ans == Integer.MAX_VALUE) {
            return -1;
        }
        return ans;
    }
    public int coin(int i , int amnt ,int[] coins){
         if(amnt == 0) return 0;// 0 amnt banane ke liye 0 coins chahiye isiliye 0 return kiya
        if(i == coins.length) return Integer.MAX_VALUE;//jb coin khtam ho jaye aur amnt remaining ho
        if(dp[i][amnt] != -1) return dp[i][amnt];
        int take = Integer.MAX_VALUE;
        if (coins[i] <= amnt) {
            int result = coin(i, amnt - coins[i], coins);
            if (result != Integer.MAX_VALUE) {
                take = 1 + result;
            }
        }
        int skip = coin( i + 1 , amnt , coins);
        dp[i][amnt] = Math.min(take  , skip);
        return  dp[i][amnt];
    }
}