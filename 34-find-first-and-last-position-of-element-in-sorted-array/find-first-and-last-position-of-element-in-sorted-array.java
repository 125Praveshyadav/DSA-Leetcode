class Solution {
    public int firstOccurrance(int[] nums , int x){
        int left = 0;
        int right = nums.length - 1;
        int ans = -1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == x){
                ans = mid;
                right = mid - 1;
            }else if(nums[mid] < x){
                left = mid + 1;
            }else {
                right = mid - 1;
            }

            }
            return ans;
        }
    

     public int lastOccurrance(int[] nums , int x){
        int left = 0;
        int right = nums.length - 1;
        int ans = -1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == x){
                ans = mid;
                left = mid + 1;
            }else if(nums[mid] < x){
                left = mid + 1;
            }else {
                right = mid - 1;
            }

            }
            return ans;
        }
    
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0) return new int[]{-1 , -1};

        int first = firstOccurrance(nums , target);
        int last = lastOccurrance(nums , target);
        return new int[]{first , last};
    }
}