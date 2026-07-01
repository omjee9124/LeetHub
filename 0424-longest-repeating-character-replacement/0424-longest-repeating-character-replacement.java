class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int low = 0;
        int res = Integer.MIN_VALUE;
        int[] freq = new int[256];

        for (int high = 0; high < n; high++) {
            freq[s.charAt(high)]++;

            int maxCount = find(freq);
            int len = high - low + 1;
            int diff = len - maxCount;

            while (diff > k) {
                freq[s.charAt(low)]--;
                low++;

                maxCount = find(freq);
                len = high - low + 1;
                diff = len - maxCount;
            }

            res = Math.max(res, high - low + 1);
        }

        return res == Integer.MIN_VALUE ? 0 : res;
    }
    public int find(int[] freq) {
        int maxCount = -1;
        for (int i = 0; i < 256; i++) {
            maxCount = Math.max(maxCount, freq[i]);
        }
        return maxCount;
    }
}