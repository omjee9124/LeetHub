class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i =0;
        int j =0;
        int sum =0;
        int n = nums.length;
        int count = Integer.MAX_VALUE;
        while(i < n && j < n){
            sum+= nums[j];
            while(sum >= target){
                int range = j-i+1;
                count = Math.min(count, range);
                sum -= nums[i];
                i++;
            }
            j++;
        }
        if(count == Integer.MAX_VALUE){
            return 0;
        }else{
            return count;
        }
    }
}