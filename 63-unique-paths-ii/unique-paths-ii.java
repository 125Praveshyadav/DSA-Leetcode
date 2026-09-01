class Solution {
    int[][] dp;
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
       int m = obstacleGrid.length;
       int n = obstacleGrid[0].length;
       dp = new int[m][n];
       for(int i = 0; i < m ; i++){
           Arrays.fill(dp[i] , -1);
       }
       return ways(0 , 0 , m ,n , obstacleGrid);    
    }
    public int ways(int i , int j , int m , int n , int[][] obstacleGrid){
        if(i >= m || j >= n) return 0;
        if(obstacleGrid[i][j] == 1) return 0;
        if(i == m - 1 && j == n - 1) return 1;
        if(dp[i][j] != -1) return dp[i][j];

        int down = ways(i + 1 , j , m , n , obstacleGrid);
        int right = ways( i , j +1 , m , n , obstacleGrid);
        dp[i][j] = down + right;
        return dp[i][j];
    }
}