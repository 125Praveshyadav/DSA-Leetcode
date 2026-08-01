class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length;
        while(left < right){
            int sq = (int) Math.pow(nums[left],2);
            nums[left] = sq;
            left++;
        }
        Arrays.sort(nums);
       return nums;
    }
}