class Solution {
    public int findMin(int[] nums) {
        int left = 0 ;
        int right = nums.length-1;
        while(left < right){// equal nhi kiya kyu ki hame minimum likhana hai na ki search karana hai
        int mid = left + (right - left)/2;
        if(nums[mid] > nums[right]){
            left = mid + 1;
        }else {
            right = mid;//mid -1 nhi kiya kyu ki mid bhi min ho skata hai
        }
        }
        return nums[left];
    }
}