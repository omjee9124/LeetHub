class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        while(left < right){
            int mod1 = nums[left] % 2;
            int mod2 = nums[right] % 2;

            if(mod1 != 0 && mod2 == 0){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left ++;
                right--;
            }

            if(mod1 == 0) left++;

            if(mod2 != 0) right--;
        }

        return nums;
    }
}