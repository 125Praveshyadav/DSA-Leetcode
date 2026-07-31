class Solution {
    //two pointer approach
    public String reverseWords(String s) {
        if(s.length() == 0) return null;
        String[] sArray = s.trim().replaceAll("\\s+" , " ").split(" ");

        int left = 0 ; 
        int right = sArray.length - 1;

        while(left <= right){
            String tmp = sArray[left];
            sArray[left] = sArray[right];
            sArray[right] = tmp;

            left++;
            right--;     
        }
      return String.join(" "  , sArray);
    }
}