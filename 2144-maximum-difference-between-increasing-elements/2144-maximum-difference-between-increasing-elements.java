class Solution {
    public int maximumDifference(int[] nums) {
        int diff = -1;
        int min = nums[0];
        for(int i =1; i< nums.length; i++){
            if(nums[i] > min){
                diff = Math.max(diff, nums[i] - min);
            }else{
                min = nums[i];
            }
        }
        return diff;
    }
}