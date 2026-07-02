class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low =0;
        int res = Integer.MAX_VALUE;
        int n =nums.length;
        int sum =0;
        for(int high =0; high < n; high++){
            sum += nums[high];
            while(sum >= target){
                int len = high - low + 1;
                sum -= nums[low];
                low++;
                res = Math.min(res,len);
            }
        }
        if(res>n) return 0;
        return res;
    }
}