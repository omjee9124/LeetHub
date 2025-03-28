class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = nums1.length-1;
        int q = m-1;
        int r = n-1;
        while(q>=0 && r>=0){
            if(nums1[q] >= nums2[r]){
                nums1[p--] = nums1[q--];
            }else{
                nums1[p--] = nums2[r--];
            }
        }
        while(q>=0){
            nums1[p--] = nums1[q--];
        }
        while(r>=0){
            nums1[p--] = nums2[r--];
        }
    }
}