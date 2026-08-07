class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int num : arr1){
            map.put(num , map.getOrDefault(num , 0) + 1);
        }
        int[] temp = new int[arr1.length];
        int count = 0;

        for(int i = 0 ; i < arr2.length ; i++){
            int freq = map.get(arr2[i]);
            for(int j = 0 ;j < freq ; j++){
                temp[count++] = arr2[i]; 
            }
            map.remove(arr2[i]);
        }
        ArrayList<Integer> remaining  = new ArrayList<>();

        for(int num : map.keySet()){
            int freq = map.get(num);
             for(int j = 0 ;j < freq ; j++){
               remaining.add(num);
            }
        }
        Collections.sort(remaining);
        for(int num : remaining){
            temp[count++] = num;
        }
        return temp;
    }
}