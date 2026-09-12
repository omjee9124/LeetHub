class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length){
            return intersect(nums2, nums1);
        }
        Map<Integer,Integer> map = new HashMap<>();
        for(int num: nums1){
            map.put(num,map.getOrDefault(num,0)+1);

        }

        int res[] = new int[nums2.length];
        int k =0;
        for(int num : nums2){
            if(map.getOrDefault(num,0) > 0 ){
                res[k++] = num;
                map.put(num,map.get(num) -1);
            }
        }
        return Arrays.copyOfRange(res,0,k);
    }
}