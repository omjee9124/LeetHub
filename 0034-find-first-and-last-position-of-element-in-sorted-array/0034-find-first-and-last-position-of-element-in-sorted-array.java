class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[] = {-1,-1};
        ans[0] = Search(nums,target,true);
        ans[1] = Search(nums,target,false);

        return ans;
    }
    int Search(int arr[], int target, boolean firstIndex){
        int s = 0;
        int e = arr.length-1;
        int ans = -1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(target>arr[mid]){
                s = mid+1;
            }else if(target< arr[mid]){
                e = mid-1;
            }else{
                if(firstIndex){
                    ans = mid;
                    e = mid-1;
                }else{
                    ans = mid;
                    s = mid+1;
                }
            }
        }
        return ans;
    }
}