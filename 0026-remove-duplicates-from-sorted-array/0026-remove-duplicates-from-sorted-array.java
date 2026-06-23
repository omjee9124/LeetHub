class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 1) return 1;
        int i = 0;
        int j = i+1;
        int n = nums.length;
        while(j < n){
            if(nums[j] == nums[i]){
                j++;
            }else{
                nums[++i] = nums[j++];
                
            }
        }
        return i+1;
    }
}