class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character , String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        String[] str = s.split(" ");
        if (pattern.length() != str.length) return false; 
        int i  = 0;
        for(char c : pattern.toCharArray()){
            String currStr = str[i];
           if(map.containsKey(c)) {
              if(!currStr.equals(map.get(c))) return false;
           }else {
            if(set.contains(currStr)) return false;// ye isliye kyu ki unique string hone chahiye mtlb to pattern char ki ek hi string nhi ho sakti hai
           map.put(c , currStr );
           set.add(currStr);
           }
           i++;
        }
        return true;
    }
}