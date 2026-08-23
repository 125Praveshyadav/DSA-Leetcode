class Solution {
    int[] dp;
    public int tribonacci(int n) {
        // if( n <= 0) return 0;
        // if(n == 1 || n == 2) return 1;

        // return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);

        //memoization
        dp = new int[n + 1];
        // Arrays.fill(dp , -1);
        return triFibo(n);
    }
    // public int triFibo(int n){
    //     if(n <=0) return 0;
    //     if(n == 1 || n == 2) return 1;
    //     if(dp[n] != -1) return dp[n];
    //     dp[n] = triFibo(n - 1) + triFibo(n - 2) + triFibo(n - 3);
    //     return dp[n];
    // }

    //tabulation
    public int triFibo(int n ){
        if(n <= 0) return 0;
        if(n == 1 || n == 2) return 1;
        dp[1] = 1;
        dp[2] = 1;
        for(int i = 3 ; i <= n ; i++){
            dp[i] = dp[i- 1] + dp[i - 2] + dp[i - 3];
        }
        return dp[n];
    }
}