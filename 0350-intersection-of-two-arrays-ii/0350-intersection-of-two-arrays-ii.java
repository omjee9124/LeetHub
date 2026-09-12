class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int j =0;
        int k =0;
        int i =0;
        int res[] = new int[nums1.length];
        while(i<nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                res[k++] = nums1[i];
                i++;
                j++;
            }else if(nums1[i] > nums2[j]){
                j++;
            }else{
                i++;
            }
        }
        return Arrays.copyOfRange(res,0,k);
    }
}