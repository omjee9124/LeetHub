class Solution {
    public int maxArea(int[] height) {
        int max = 0 ;
        int i = 0;
        int j = height.length-1;
        while(i<j){
            int min = Math.min(height[i], height[j]);
            int length = j-i;
            int water = min * length;
            max = Math.max(max,water);
            if(height[i] < height[j]){
                i++;
            }else{
                j--;
            }
        }
        return max;
    }
}