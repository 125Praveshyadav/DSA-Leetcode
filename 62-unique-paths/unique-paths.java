class Solution {
    //Memoization
    int[][] dp;
    public int uniquePaths(int m , int n){
        dp = new int[m][n];
        for(int i = 0 ; i < m ; i++){
            Arrays.fill(dp[i] , -1);
        }
        return ways(0 , 0 , m ,n);
    }
    public int ways(int i , int j , int m , int n){
         if(i>=m || j >= n){
            return 0;
        }
        if(i == m - 1 && j == n - 1){
            return 1;
        }
       
        if(dp[i][j] != -1) return dp[i][j];
        int down = ways(i + 1 , j , m ,n);
        int right = ways(i , j + 1 , m , n);
        
        dp[i][j] = down + right;
        return dp[i][j];
    }
    // public int uniquePaths(int m, int n) {

    //     int[] dp = new int[n];

    //     Arrays.fill(dp, 1);

    //     for (int i = 1; i < m; i++) {

    //         for (int j = 1; j < n; j++) {

    //             dp[j] = dp[j] + dp[j - 1];
    //         }
    //     }

    //     return dp[n - 1];
    // }
}