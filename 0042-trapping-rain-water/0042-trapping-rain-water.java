class Solution {
    public int trap(int[] height) {
        int prefix[] = new int[height.length];
        prefix[0] = height[0];
        for(int i = 1; i < height.length; i++){
            prefix[i] = Math.max(height[i], prefix[i-1]);
        }
        
        int suffix[] = new int[height.length];
        suffix[height.length-1] = height[height.length-1];
        for(int i = height.length-2;i>=0;i--){
            suffix[i] = Math.max(suffix[i+1],height[i]);
        }

        int maxWater = 0;
        for(int i = 0; i< height.length; i++){
            int water = Math.min(prefix[i], suffix[i])-height[i];
            maxWater +=water;
        }
        return maxWater;
    }
}