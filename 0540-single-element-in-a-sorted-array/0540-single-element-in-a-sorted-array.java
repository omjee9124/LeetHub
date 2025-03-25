class Solution {
    public int singleNonDuplicate(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        int mid;
        if(arr.length ==1){
            return arr[0];
        }
        if(arr[start] != arr[start+1] ){
            return arr[start];
        }
        if(arr[end] != arr[end-1] ){
            return arr[end];
        }
        while(start<=end){
            mid = start +(end-start)/2;
            if(arr[mid] != arr[mid+1] && arr[mid] != arr[mid-1]) {
                return arr[mid];
            }
            if(arr[mid] == arr[mid-1]){
                if((mid - start-1)%2 ==1){
                    end = mid-2;
                }else{
                    start = mid+1;
                }

            }
            else{
                if((mid - start)%2 ==0) {
                    start = mid + 2;
                }else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}