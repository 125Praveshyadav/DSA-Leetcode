class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
       HashSet<Integer> set = new HashSet<>();
       int max = Integer.MIN_VALUE;
       int min = Integer.MAX_VALUE;
       for(int num : nums){
        set.add(num);
       }
        
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] > max){
                max =  nums[i];
            }
             if(nums[i] < min){
                min = nums[i];
            }
        }
        for(int i = min ; i <= max ; i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}