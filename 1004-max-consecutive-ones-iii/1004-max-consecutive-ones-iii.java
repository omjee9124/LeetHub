class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int low = 0;
        int res = 0;
        int[] freq = new int[2];

        for (int high = 0; high < n; high++) {
            freq[nums[high]]++;

            while (freq[0] > k) {
                freq[nums[low]]--;
                low++;
            }

            res = Math.max(res, high - low + 1);
        }

        return res;
    }
}