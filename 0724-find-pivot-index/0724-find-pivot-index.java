class Solution {
    public int pivotIndex(int[] nums) {
        int pre=0;

        for(int i =0 ; i<nums.length; i++){
            pre += nums[i]; 
        }

        int ans =-1;
        int suff =0;

        for(int i=nums.length-1;i>=0;i--){
            pre -= nums[i];
            if(pre == suff){
                ans = i;
            }

            suff += nums[i];
        }

        return ans;
    }
}