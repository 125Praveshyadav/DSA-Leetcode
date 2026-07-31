class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() != 0 && magazine.length() == 0 ) return false;
        HashMap<Character , Integer> map = new HashMap<>();

        for(char ch : magazine.toCharArray() ){
            map.put(ch , map.getOrDefault(ch , 0) + 1);
        }

        for(int i = 0 ; i < ransomNote.length() ; i++ ){
            char ch = ransomNote.charAt(i);
            if(!map.containsKey(ch)){
                return false;
            }else {
                map.put(ch , map.get(ch) - 1);
                if(map.get(ch) == 0) map.remove(ch);
            }
        }
       return true;
    }
}