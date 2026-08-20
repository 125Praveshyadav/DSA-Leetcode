class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        //two pointer --> bahut hi interesting hai pr best approach nhi
        int left = 0 , right = arr.length - 1;
        
        while(right - left + 1 > k){
            if(Math.abs(x - arr[left]) > Math.abs(x - arr[right]) ){
                left++;
            }else {
                right--;//agr diff barabr bhi hua to right-- krenge kyu ki right wala large hai 
            }
        }
        List<Integer> res = new ArrayList<>();
        for(int i = left ; i <= right ; i++){
            res.add(arr[i]);
        }
        return res;
       }
}