class Solution {
    public int heightChecker(int[] heights) {

       int[]  expected = new int[heights.length];
       for(int i = 0 ; i < expected.length ; i++){
         expected[i] = heights[i];
       }
       //bouble sort use kr ke sort kr lete hai ya built in sort use ke ke dekhate hai
    //    Arrays.sort(expected);// isase bhi ho jayega pr bouble sort laga ke dekhate hai
    for(int i = 0 ; i  <  expected.length -1 ; i++){
        int swap =0;
        for(int j = 0 ; j < expected.length -1 ;j++){
            if(expected[j] > expected[j + 1]){
                int temp = expected[j];
                expected[j] = expected[j + 1];
                expected[j + 1] = temp;

                swap++;
            }
        }
         if(swap == 0) break;
    }
       int count = 0;
       for(int i = 0 ;i < expected.length ; i++){
        if(heights[i] != expected[i]) count++;
       }
       return count;
    }
}