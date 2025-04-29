class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int n = nums.length/2;
        for(int i = 0; i < nums.length; i++){
            int count = 0 ;
            for(int j = i+1; j < nums.length; j++){
                if(nums[j] == nums[i]){
                    count++;
                }
                if(count>= n){
                    return nums[i];
                }
            }
            
        }
        return -1;
    }
}