class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String , Integer> map = new HashMap<>();
        for(int i = 0 ; i < words.length ; i++){
            map.put(words[i] , map.getOrDefault(words[i] , 0) + 1);
        }
        Arrays.sort(words , (a ,b ) -> {
           if(!map.get(a).equals(map.get(b))) {
              return map.get(b) - map.get(a);// high to low
           }
           return a.compareTo(b);
        });
         List<String> res = new ArrayList<>();
         for(int i = 0 ; i < words.length ; i++){
            if(!res.contains(words[i])){
                res.add(words[i]);
                if(res.size() == k) return res;
            }
         }
         return res;
    }
}