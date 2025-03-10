class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        // int min = 0;
        // int length = Integer.MAX_VALUE;
        // for(int i  = 0; i< nums.length; i++){
        //     int sum =0;
        //     for(int j = i; j < nums.length; j++){
                             
        //         sum +=  nums[j];
        //         if(sum >= target){
        //             int diff = j-i+1;
        //             length = Math.min(length, diff);
        //         } 
        //     }
        // }
        // if(length > target){
        //     return 0;
        // }
        // return length;
        

        int n = nums.length;
        int minLength = Integer.MAX_VALUE;
        int left =0;
        int sum =0;
        for(int right = 0 ;right<n; right++){
            sum+= nums[right];

            while(sum>=target){
                minLength = Math.min(minLength,right-left+1);
                sum-=nums[left];
                left++;
            }
        }
        if(minLength > target){
            return 0;
        }
        return minLength;

    }
}