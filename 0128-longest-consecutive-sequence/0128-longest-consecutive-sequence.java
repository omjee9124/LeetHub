class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length ==0) return 0;
        Arrays.sort(nums);
        int count =1;
        int cs =1;
        int num =nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1]) continue;
            num++;            
            if(num == nums[i]){
                cs++;
            }else{
                num = nums[i];
                cs =1;
            }
            count = Math.max(count,cs);
        }
        return count;
    }
}