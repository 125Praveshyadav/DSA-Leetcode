class Solution {
    public int findClosest(int x, int y, int z) {
        if(Math.abs(z - x) < Math.abs(y - z)){
            //person 1 first reach at person 3
            return 1;
        }else if (Math.abs(z - x) > Math.abs(y - z)) {
            return 2;
        }else {
            return 0;
        }
       
    }
    
}