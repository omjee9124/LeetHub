public class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        if (nums.length % 3 != 0) return new int[0][0];

        int[][] res = new int[nums.length / 3][3];
        int index = 0;

        for (int i = 0; i < nums.length; i += 3) {
            if (nums[i + 2] - nums[i] > k) return new int[0][0];
            res[index][0] = nums[i];
            res[index][1] = nums[i + 1];
            res[index][2] = nums[i + 2];
            index++;
        }

        return res;
    }
}
