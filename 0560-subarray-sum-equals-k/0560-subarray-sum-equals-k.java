class Solution {
    public int subarraySum(int[] nums, int k) {
        int i = 0, j = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum =0;
        int count = 0;
        for(int n = 0 ; n< nums.length; n++){
            sum+=nums[n];
            if(map.containsKey(sum-k)){
                count+= map.get(sum-k);

            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;

    }
}