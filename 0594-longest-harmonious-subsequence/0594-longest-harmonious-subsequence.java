public class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int j = 0;
        int count = 0;
        
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] - nums[j] > 1) {
                j++;
            }
            if (nums[i] - nums[j] == 1) {
                count = Math.max(count, i - j + 1);
            }
        }
        return count;
    }
}