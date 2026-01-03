class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ans =Integer.MAX_VALUE;
        int low =0; int high=0;
        int sum =0;
        int n = nums.length;
        while(high<n){
            sum+= nums[high];
            while(sum>=target){
                int len = high-low+1;
                ans= Math.min(len,ans);
                sum -=nums[low++];
            }
            high++;
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}