class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[] = new int[]{-1,-1};
        int left = bSearch(nums, target, true);
        int right = bSearch(nums, target, false);
        arr[0] = left;
        arr[1] = right;
        return arr;
    }
    private int bSearch(int []nums, int target,boolean isLeft){
        int s =0;
        int e =nums.length-1;
        int idx = -1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(nums[mid] < target){
                s = mid+1;
            }else if(nums[mid] > target){
                e = mid-1;
            }else{
                idx = mid;
                if(isLeft){
                    e = mid-1;
                }else{
                    s = mid+1;
                }
            }
        }
        return idx;
    }

}