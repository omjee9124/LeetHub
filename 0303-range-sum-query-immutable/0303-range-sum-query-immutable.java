class NumArray {
    int[] num;
    public NumArray(int[] nums) {
        num = new int[nums.length];
        num[0] = nums[0];
        for(int i = 1; i< nums.length; i++){
            num[i] = num[i-1]+nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        int ans = 0;
        if(left == 0){
            ans = num[right];
        }else{
            ans = num[right] - num[left-1];
        }
        
        return ans;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */