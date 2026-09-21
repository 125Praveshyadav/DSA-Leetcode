class Solution {
    public int reverseDegree(String s) {
      int sumTotal = 0;
      for(int i = 0 ; i < s.length() ; i++){
        int reverseDegree = 'z' - s.charAt(i) + 1;// yaha hame 122 - 97(a) + 1 = 26 reverse order
        sumTotal += reverseDegree * (i + 1);
      }
      return sumTotal;
        
    }
}