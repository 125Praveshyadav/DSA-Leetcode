class Solution {
    public String reversePrefix(String s, int k) {
       Stack<Character> st = new Stack<>();
       for(int i = 0 ; i < k ; i++){
        st.push(s.charAt(i));
       }
       StringBuilder sb = new StringBuilder();
       while(!st.isEmpty()){
        sb.append(st.pop());
       }
       for(int i = k ; i < s.length() ; i++){
        sb.append(s.charAt(i));
       } 
       return sb.toString();
    }
}