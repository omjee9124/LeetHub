class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int pointer = 0;
        while(pointer<=right){
            if(nums[pointer] == 0){
                int temp = nums[pointer];
                nums[pointer] = nums[left];
                nums[left] = temp;
                left++;
                pointer++;
            }else if(nums[pointer] == 2){
                 int temp = nums[pointer];
                nums[pointer] = nums[right];
                nums[right] = temp;
                right--;
            }else{
               pointer++;
            }
        }

    }
}