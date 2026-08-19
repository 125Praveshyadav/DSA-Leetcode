class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> result = new ArrayList<>();
        int[] lastOccur = new int[26];
        //yaha ham last occurrance nikal rahe hai ye imp sikhane ko mila
        for(int i = 0 ; i < s.length() ; i++  ){
            lastOccur[s.charAt(i) - 'a'] = i;//yaha ye ho raha hai ki agr koi char pahale aa jaye to vah store ho jayega agr vahi char bad me aayega means last occur to vah pahale wala se replace ho jayega
        }
        int start = 0 , end = 0;

        for(int i = 0 ; i < s.length() ;i++){
            end = Math.max(end , lastOccur[s.charAt(i) - 'a']);//yaha extend kr rahe hai
            //partition closed
            if(i == end){
                result.add(end - start +1);
                start = i+ 1;
            }

        }
        return result;

    }
}