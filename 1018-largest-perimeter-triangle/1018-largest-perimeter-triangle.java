class Solution {
    public int largestPerimeter(int[] nums) {
        int sum =0;
        int max =0;
        Arrays.sort(nums);
        for(int i =0; i<= nums.length-3; i++){
            sum =0;
            if((nums[i] + nums[i+1] > nums[i+2]) && 
            (nums[i] + nums[i+2] > nums[i+1]) &&
            nums[i+1] + nums[i+2] > nums[i]){
                sum = nums[i]+ nums[i+1] + nums[i+2];
                max = Math.max(sum, max);
            }
        }
        return max;
    }
}