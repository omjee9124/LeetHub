class Solution {
    public int[] productExceptSelf(int[] nums) {
        int arr[] = new int[nums.length];
        int p[] = new int[nums.length];
        p[0] = nums[0];
        for(int i =1; i<nums.length;i++){
            p[i] = nums[i]* p[i-1];
        }
        int s[] = new int[nums.length];
        s[nums.length-1] = nums[nums.length-1];
        for(int i = nums.length-2; i>=0; i--){
            s[i] = nums[i] * s[i+1];
        }
        for(int i =0 ; i<arr.length; i++){
            if(i==0){
                arr[i] = s[i+1];
            } else if(i == arr.length-1){
                arr[i] = p[i-1];
            }else{
                arr[i] = s[i+1] * p[i-1];
            }
        }
        return arr;

    }
}