class Solution {
    public int jump(int[] nums) {
        int left=0;
        int right=0;
        int count =0;
        int max =nums[0];
        int k =0;
        if(nums.length == 1){
            return 0;
        }
        while(max< nums.length-1){
            
            left = k+1;
            right = max;
            k = max;
            for(int i =left; i<=right;i++){
                
                max = Math.max(max,i+nums[i]);
                
            }
            
            count++;
        }
        return count+1;
    }
}