class Solution {
    public boolean search(int[] nums, int target) {
       int left = 0 , right = nums.length - 1;
       while(left  <=  right){
        int mid = left + (right - left)/2;
        if(nums[mid] == target) return true;
        if(nums[left] == nums[mid] && nums[mid] == nums[right]){
            left++;
            right--;
            continue;//continue isliye kiye ki jb teeno hi duplicate hai to ho currect iteration skip kr denge
        }
        if(nums[left] <= nums[mid]){
            if(nums[left] <= target && target < nums[mid]){
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }else {
            if(nums[mid] < target && target <= nums[right]){
                left = mid + 1;
            }else {
                right = mid -1;
            }
        }
       } 
       return false;
    }
}