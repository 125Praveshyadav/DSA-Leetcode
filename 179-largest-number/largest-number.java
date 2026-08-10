class Solution {
    public String largestNumber(int[] nums) {
      String[] str = new String[nums.length];
      //int -> string
      for(int i = 0 ; i < nums.length ; i++){
        str[i] = String.valueOf(nums[i]);
      }

      Arrays.sort(str , (a , b) -> {
        String ab = "" + a + b;
        String ba = "" + b + a;
        return ba.compareTo(ab);
      });
      //sabse imp edge cases
      if(str[0].equals("0")){
        return "0";//agr largest element in 0 hai to zero return kr denge
      }
      String res = "";
      for(int i = 0 ; i < str.length ; i++){
        res += str[i];
      }
      return res;
    }
}