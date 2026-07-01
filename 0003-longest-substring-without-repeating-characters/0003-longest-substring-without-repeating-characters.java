class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int low = 0;
        int res = Integer.MIN_VALUE;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int high = 0; high < n; high++) {
            char ch = s.charAt(high);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            int len = high - low + 1;

            while (map.size() < len) {
                char left = s.charAt(low);
                map.put(left, map.get(left) - 1);

                if (map.get(left) == 0) {
                    map.remove(left);
                }

                low++;
                len = high - low + 1;
            }

            res = Math.max(res, high - low + 1);
        }

        return res == Integer.MIN_VALUE ? 0 : res;
    }
}