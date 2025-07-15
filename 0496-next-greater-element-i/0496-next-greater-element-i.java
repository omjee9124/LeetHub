class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int arr[] = new int[nums1.length];
        for(int i =0; i<nums1.length; i++){
            for(int j = 0;j<nums2.length;j++){
                if(nums1[i] == nums2[j] && j != nums2.length-1){
                    for(int k =j+1; k<nums2.length;k++){
                        if(nums2[k]>nums2[j]){
                            arr[i] = nums2[k];
                            break;
                        }
                    }
                    if(arr[i] == 0){
                        arr[i] = -1;
                    }
                }
                if(arr[i] ==0){
                    arr[i] = -1;
                }
            }
        }
        return arr;
    }
}