class Solution {
    int[] dp;
    public int maxEarn(int i , int[] points){
        if(i >= points.length) return 0;
        if(dp[i] != -1) return dp[i];
        int pick = points[i] + maxEarn(i + 2 , points);//jo nums le liye phir uske baad aur pahale wale means adjusted num nhi le skate
        int skip = maxEarn(i+1 , points);
        dp[i] = Math.max(pick , skip);
        return dp[i];
    }
    public int deleteAndEarn(int[] nums) {
        //recursion 
        // int max = Integer.MIN_VALUE;
        // for(int num : nums){
        //     max = Math.max(max , num);
        // }
        // int[] points = new int[max + 1];//yaha ham feq(jitani baat vah num aayega hoga agr num 2 3 baar aaye hai to 2 + 2 + 2 = 6) calculate kr rahe hai duplicate num ka
        // for(int num : nums){
        //     points[num] += num;
        // }
        //ab yaha tak ye question house robber ki trh ban gya hai [2, 2, 3, 3, 3 , 4] = [0 , 0 , 4, 9 , 4]

        // return maxEarn(0 , points);
        

        //memoization
     
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            max = Math.max(max , num);
        }
        int[] points = new int[max + 1];
        for(int num : nums){
            points[num] += num;
        }
         
        dp = new int[max + 1];
        Arrays.fill(dp , -1 );
        return maxEarn(0 , points);
    }
}