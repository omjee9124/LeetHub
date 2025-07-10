class Solution {
    public int maxFreeTime(int eventTime, int[] startTime, int[] endTime) {
        int n = startTime.length;
        if (n == 0) {
            return eventTime;
        }

        int[] gap = new int[n + 1];
        gap[0] = startTime[0];

        for (int i = 1; i < n; i++) {
            gap[i] = startTime[i] - endTime[i - 1];
        }

        gap[n] = eventTime - endTime[n - 1];

        int[] largestRight = new int[n + 1];
        for (int i = n - 1; i >= 0; i--) {
            largestRight[i] = Math.max(largestRight[i + 1], gap[i + 1]);
        }

        int max = 0, largestLeft = 0;
        for (int i = 1; i <= n; i++) {
            int duration = endTime[i - 1] - startTime[i - 1];
            boolean canFitLeft = largestLeft >= duration;
            boolean canFitRight = largestRight[i] >= duration;

            if (canFitLeft || canFitRight) {
                int merged = gap[i - 1] + gap[i] + duration;
                max = Math.max(max, merged);
            }

            max = Math.max(max, gap[i - 1] + gap[i]);
            largestLeft = Math.max(largestLeft, gap[i - 1]);
        }

        return max;
    }
}