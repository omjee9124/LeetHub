class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int left = 0, maxLen = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int right = 0; right < n; right++) {
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);

            // shrink window if more than 2 fruit types
            while (map.size() > 2) {
                int leftFruit = fruits[left];
                map.put(leftFruit, map.get(leftFruit) - 1);
                if (map.get(leftFruit) == 0)
                    map.remove(leftFruit);
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

}