class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(k%n == 0) return;
        k = k%n;

        rotaterange(nums,0, nums.length -1);
        rotaterange(nums,0,k-1);
        rotaterange(nums, k, nums.length-1);
    }
    void rotaterange(int[] nums, int left, int right){
        while(left<=right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}