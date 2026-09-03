class Solution {
    Integer[][][] dp;
    public int findMaxForm(String[] strs, int m, int n) {
        int l = strs.length;
        dp = new Integer[l][m+1][n+1];//yaha +1 isliye le rahe hai kyu ki 0 ko bhi maitain krana hai (0- based indexing)
       return maxSubset(0 , m , n , strs);
    }

    public int maxSubset(int i ,int m , int n , String[] str){
        if(i == str.length) return 0;

        if(dp[i][m][n] != null) return dp[i][m][n];
        int zeros = 0;
        int ones = 0;
        for(char ch : str[i].toCharArray()){
            if(ch == '0') zeros++;
            else ones++;
        }

        int take = 0;
        if(zeros <= m && ones <= n){
            take = 1 + maxSubset(i +1 , m-zeros , n - ones , str);
        } 
        int skip = maxSubset(i + 1 , m , n ,str);
        dp[i][m][n] = Math.max(take , skip);
        return  dp[i][m][n];
    }
}