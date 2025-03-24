class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums.length ==0){
            return 0;
        }
        return BS(nums,target,0,nums.length-1);
    }
    public static int BS(int arr[], int target,int start, int end){
        int mid =0;
        while(start <= end){
            mid = (start + end)/2;
            if(target == arr[mid]){
                return mid;
            }
            else if(target > arr[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
            
        }
        return start;
    }
}