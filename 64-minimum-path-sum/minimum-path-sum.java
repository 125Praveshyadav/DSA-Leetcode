class Solution {
    // int[][] dp;
    // public int minPathSum(int[][] grid) {
    //     int m = grid.length;
    //     int n = grid[0].length;
    //     dp = new int[m][n];
    //     for(int i = 0 ; i < m ;i++){
    //         Arrays.fill(dp[i] , -1);
    //     }
    //     return minCost(0 , 0 , m , n , grid);  
    // }
    // public int minCost(int i , int j , int m ,int n , int[][] grid){
    //     if(i >= m || j >= n) return Integer.MAX_VALUE;
    //     if(i == m -1 && j == n - 1) return grid[i][j];
    //     if(dp[i][j] != -1) return dp[i][j];
    //     int down =  minCost( i + 1 , j , m ,n , grid);
    //     int right =  minCost(i , j + 1 , m ,n , grid);
    //      dp[i][j] = grid[i][j] + Math.min(down , right);
    //     return dp[i][j];

    // }
     public int minPathSum(int[][] grid){
           int m = grid.length;
           int n = grid[0].length;
           int[][] dp = new int[m][n];
           dp[0][0] = grid[0][0] ;
           for(int j = 1 ; j < n ; j++){
              dp[0][j] = grid[0][j] + dp[0][j-1];
           }
            for(int i = 1 ; i < m ; i++){
              dp[i][0] = grid[i][0] + dp[i-1][0];
           }
           for(int i = 1 ; i < m ; i++){
            for(int j = 1 ; j < n ;j++){
                dp[i][j] = grid[i][j] + Math.min(dp[i-1][j] , dp[i][j-1]);
            }
           }
           return dp[m-1][n-1];
     }
}