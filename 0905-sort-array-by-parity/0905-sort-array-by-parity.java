class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int l =0;
        int r = n-1;
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            if(nums[i] % 2 != 0){
                arr[r--] = nums[i];
            }else{
                arr[l++] = nums[i];
            }
        }

        return arr;
    }
}