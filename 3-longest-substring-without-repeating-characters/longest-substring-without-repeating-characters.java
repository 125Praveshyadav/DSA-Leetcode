class Solution {
    public int lengthOfLongestSubstring(String s) {
        // HashSet<Character> set = new HashSet<>();
        // int max = 0;
        // int left = 0;

        // for(int right = 0 ;  right < s.length() ; right++){
        //     while(set.contains(s.charAt(right))){
        //         set.remove(s.charAt(left));
        //         left++;
        //     }
        //     set.add(s.charAt(right));
        //     max = Math.max(max , right - left + 1);
        // }
        // return max;

        HashMap<Character , Integer> map = new HashMap<>();
        int ans = 0;
        int left = 0;

        for(int right = 0 ; right < s.length() ; right++){
            char ch = s.charAt(right);

            if(map.containsKey(ch)){
                if(map.get(ch) >= left){
                    left = map.get(ch) + 1;
                }
            }
            map.put(ch , right);
            ans = Math.max(ans , right - left + 1);
        }
        return ans;
    }
}