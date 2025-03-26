class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int s = 0;
        int e = arr.length-1;
        int mid;
        while(s<=e){
            mid = s+(e-s)/2;
            if(arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]){
                return mid;
            }
            if(arr[mid] > arr[mid+1]){
                e = mid-1;
            }else{
                s = mid+1;
            }
        }
        return -1;
    }
}