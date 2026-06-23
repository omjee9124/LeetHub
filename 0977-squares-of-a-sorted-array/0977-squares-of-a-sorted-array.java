class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i =0 ;i < nums.length;i++){
            nums[i] = nums[i] * nums[i];

        }

        // int i =0;
        // int j =nums.length-1;
        // while(i<j){
        //     if(nums[j] < nums[i]){
        //         int temp = nums[j];
        //         nums[j] = nums[i];
        //         nums[i] = temp;
        //     }
        //     j--;
        // }
        // return nums;
        Arrays.sort(nums);
        return nums;
    }
}