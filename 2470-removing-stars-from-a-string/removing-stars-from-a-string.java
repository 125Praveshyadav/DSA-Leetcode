class Solution {
    public String removeStars(String s) {
        Stack<Character> str = new Stack<>();
        for(int i = 0 ;i < s.length() ; i++){
            char ch = s.charAt(i);
            if(ch != '*'){
                str.push(ch);
            }else{
                str.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!str.isEmpty()) sb.append(str.pop());
        return sb.reverse().toString();
    }
}