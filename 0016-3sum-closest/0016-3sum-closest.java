class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int resultSum = 0;
        int maxDiff = Integer.MAX_VALUE;
        for(int i =0 ; i<n-2;i++){
            int left = i+1;
            int right = n-1;
            
            while(left < right){
                int sum = nums[left] + nums[right]+ nums[i];
                
                int diff = Math.abs(target-sum);
                if(diff<maxDiff){
                    maxDiff = diff;
                    resultSum = sum;
                }
                if(sum == target){
                    return resultSum;
                }else if(sum<target){
                    left++;
                }else{
                    right--;
                }
            }
            
        }
        return resultSum;
    }
}