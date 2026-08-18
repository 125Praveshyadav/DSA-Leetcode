class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        //dono array ko sort krane ke baad do pointer leke dono pr start krenge s pr child aur s pr cookies

        int cookies = 0 , child = 0;
        while(child < g.length && cookies < s.length){
            if(s[cookies] >= g[child]) child++;
            cookies++;      
        }
        return child;
    }
}