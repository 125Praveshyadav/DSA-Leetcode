class Solution {
    public List<String> commonChars(String[] words) {
       int[] freq = new int[26];
       for(char ch : words[0].toCharArray()){
          freq[ch - 'a']++;
       }

       for(int i = 1 ; i < words.length ; i++){
            int[] freq1 = new int[26];
            for(char ch : words[i].toCharArray()){
                freq1[ch - 'a']++;
            }
            for(int j = 0 ; j < 26 ; j++){
                freq[j] = Math.min(freq[j] , freq1[j]);
            }
       }
       List<String> res = new ArrayList<>();
       for(int i = 0 ; i < 26 ; i++){
        if(freq[i] != 0){
            char ch = (char)(i + 97);
            int count = freq[i];
            while(count > 0){
                res.add("" + ch);
                count--;
            }
        }
       }
       return res;
    }
}