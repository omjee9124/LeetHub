class Solution {
    public int dominantIndex(int[] nums) {
        int largestNumber = 0;
        int largestIndex = -1;
        int n = nums.length;

        for(int i =0; i< n; i++){
            if(nums[i] > largestNumber){
                largestNumber = nums[i];
                largestIndex = i;
            }
        }

        int count =0;
        for(int i =0; i<n; i++){
            if(nums[i] *2 > largestNumber) count++;
            
        }
        if(count > 1) return -1;

        return largestIndex;
    }
}