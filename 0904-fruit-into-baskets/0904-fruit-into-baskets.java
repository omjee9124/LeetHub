class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int low = 0;
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int high =0; high < n; high++){
            int l = fruits[high];
            map.put(l, map.getOrDefault(l,0)+1);

            while(map.size() >2){
                int r = fruits[low];
                map.put(r, map.get(r) -1);
                if(map.get(r) == 0){
                    map.remove(r);
                }
                low++;
            }
            res = Math.max(res, high-low+1);
        }
        return res;
    }
}