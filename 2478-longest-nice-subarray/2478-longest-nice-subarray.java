class Solution {
    public int longestNiceSubarray(int[] nums) {
        int n = nums.length;
        int mL = 1;
        int left = 0;
        int bits = 0;
        
        for (int right = 0; right < n; right++) {
            while ((bits & nums[right]) != 0) {
                bits ^= nums[left];
                left++;
            }
            
            bits |= nums[right];
            mL = Math.max(mL, right - left + 1);
        }
        
        return mL;
    }
}