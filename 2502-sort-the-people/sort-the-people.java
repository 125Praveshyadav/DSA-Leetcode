class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
      HashMap<Integer  , String> map = new HashMap<>();
      for(int i = 0 ; i < heights.length ; i++){
        map.put(heights[i] ,names[i]);
      }

      Arrays.sort(heights);
     
      String[] str = new String[names.length];
      int idx = 0;//kyu ham last element se startr kr rahe ahi kyu ki heights ko hamne 
        for(int i = heights.length - 1  ; i >= 0 ;i--){
            str[idx++] = map.get(heights[i]);
        }
       
       return str;
 }
}