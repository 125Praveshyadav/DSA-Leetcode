class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        // List<Integer> list = new ArrayList<>();

        helper(1 ,n , k , new ArrayList<>());
        return result; 
    }

    public void helper(int i ,int n , int k , List<Integer> list){

        //base case
        if(list.size() == k){
            result.add(new ArrayList<>(list));
            return;
        }
        if(i >  n){//mtlb last number jyda ho gya
            return;
        }
        //include
        list.add(i);
        helper(i+1 ,n , k , list);
        //backtrack and exclude
        list.remove(list.size() - 1);
        helper(i + 1 ,n, k , list);      

    }
}