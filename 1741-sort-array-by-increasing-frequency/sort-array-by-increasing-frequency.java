class Solution {
    public int[] frequencySort(int[] nums) {
       HashMap<Integer , Integer> map = new HashMap<>();
       for(int num: nums){
        map.put(num , map.getOrDefault(num , 0) + 1);
       }
       Integer[] arr = new Integer[nums.length];
       for(int i = 0; i < arr.length ; i++){
        arr[i] = nums[i];
       }

       Arrays.sort(arr , (a , b) -> {
           if(map.get(a) != map.get(b)){
              //increasing order freq ke based pr
              return map.get(a) - map.get(b);
           }
           //freq same hai to decending order me value ho rakheneg
           return b - a;
       });

       for(int i = 0 ;i < nums.length ;i++){
         nums[i] = arr[i];
       }
    return nums;
    }
}