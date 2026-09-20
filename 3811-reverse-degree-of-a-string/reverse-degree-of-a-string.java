class Solution {
    public int reverseDegree(String s) {
      int sumTotal = 0;
      for(int i = 0 ; i < s.length() ; i++){
        int reverseDegree = 'z' - s.charAt(i) + 1;
        sumTotal += reverseDegree * (i + 1);
      }
      return sumTotal;
        
    }
}