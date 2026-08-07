class Solution {
    public static void swap(int[] nums ,int a , int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp; 
    }
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while(mid <= high){
            if(nums[mid] == 0){
                swap( nums ,low , mid);
                low++ ;
                mid++;
            } else if(nums[mid] == 1){
                mid++;//yaha swap nhi kiya kyu ki 1 hai 0 iske piche aayega aur 2 iske aage
            } else{
                swap(nums , mid , high);
                high--;
                //mid ko ++ nhi kiya kyu ki jo high se aaya hai mid pr vah abhi unknown hai usko abhi nhi check kiye hai 
            }
        }
    }
}