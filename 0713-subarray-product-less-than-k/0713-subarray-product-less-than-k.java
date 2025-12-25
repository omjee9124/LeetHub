class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count =0;
        int n = nums.length;
        for(int i =0; i<n; i++ ){
            if(nums[i] >= k) continue;
            count++;
            int max = nums[i];
            for(int j = i+1; j<n;j++){
                max*=nums[j];
                if(max >= k){
                    break;
                }
                count++;
            }
        }
        return count;
    }
}