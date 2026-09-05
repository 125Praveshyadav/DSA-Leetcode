class Solution {
    public int lengthOfLastWord(String s) {
       String[] str = s.trim().split(" ");
       String sl = str[str.length - 1];
       return sl.length();

    }
}