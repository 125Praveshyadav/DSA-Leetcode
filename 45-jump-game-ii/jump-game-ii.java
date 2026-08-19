class Solution {
    public int jump(int[] nums) {
    if(nums.length == 1) return 0;
        int minJump = 0;
        int destination = nums.length - 1;
        int coverage = 0;
        int lastJumpIdx = 0;
        for(int i = 0 ; i < nums.length ; i++){
            coverage = Math.max(coverage , i + nums[i]);
            if(i == lastJumpIdx){
                lastJumpIdx = coverage;
                minJump++;
                if(coverage >= destination){
                    return minJump;
                }
            }
        }
        return minJump;
    }
}