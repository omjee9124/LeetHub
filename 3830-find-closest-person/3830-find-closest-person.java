class Solution {
    public int findClosest(int x, int y, int z) {
        int minx = Math.abs(z-x);
        int miny = Math.abs(z-y);
        if(minx > miny){
            return 2;
        }
        else if(minx < miny) {
            return 1;
        }else{
            return 0;
        }
    }
}