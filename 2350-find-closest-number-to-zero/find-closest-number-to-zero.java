class Solution {
    public int findClosestNumber(int[] nums) {
        int ans = 0;
        int left = 0 , right = nums.length  - 1;
        while(left < right){
            if(Math.abs(nums[left]) == Math.abs(nums[right])){
               if(nums[left] < nums[right]){
                ans = nums[right];
               } else {
                ans = nums[left];
               }
               left++;
               right--;
            }else if(Math.abs(nums[left]) < Math.abs(nums[right]) ){
                ans = nums[left];
                right--;
            }else {
                ans = nums[right];
                left++;
            }
        }
        return ans;
    }
}