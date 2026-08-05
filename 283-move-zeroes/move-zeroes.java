class Solution {
    public void moveZeroes(int[] nums) {
    //    int n = nums.length;
    //    for(int i = 0 ;i < n - 1 ; i++){
    //     for(int j = 0 ; j < n - i - 1; j++){
    //         if(nums[j] == 0 ){
    //             int temp = nums[j];
    //             nums[j] = nums[j + 1];
    //             nums[j + 1] = temp;
    //         }
    //     }
    //    }

    // int left = 0;
    // int right = 1;

    // while(right < nums.length){
    //     if(nums[left] == 0){
    //         int temp = nums[left];
    //         nums[left] = nums[right];
    //         nums[right] = temp;
    //      }
    //      if(nums[left] == 0){
    //       right++;
    //      }else {
    //         left++;
    //         right++;
    //      }            
    // }
    List<Integer> list = new ArrayList<>();
    int count = 0;
    for(int i = 0 ; i < nums.length ; i++){   
        if(nums[i] != 0){
            list.add(nums[i]);
        } else {
            count++;
        }
    }
    while(count > 0){
        list.add(0);
        count--;
    }
    for(int i = 0 ; i < list.size() ; i++){
        nums[i] = list.get(i);
    }
    }
}