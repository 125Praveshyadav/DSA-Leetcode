class Solution {
    public int heightChecker(int[] heights) {

       int[]  expected = new int[heights.length];
       for(int i = 0 ; i < expected.length ; i++){
         expected[i] = heights[i];
       }
       //bouble sort use kr ke sort kr lete hai ya built in sort use ke ke dekhate hai
       Arrays.sort(expected);
       int count = 0;
       for(int i = 0 ;i < expected.length ; i++){
        if(heights[i] != expected[i]) count++;
       }
       return count;
    }
}