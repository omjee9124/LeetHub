class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> s = new Stack<>();
        int max = 0;
        for (int i = 0; i < heights.length; i++) {
            if (s.isEmpty()) {
                s.push(i);
            }
            else if (heights[i] >= heights[s.peek()]) {
                s.push(i);
            } else {
                while (!s.isEmpty() && heights[i] < heights[s.peek()]) {
                    int h = heights[s.pop()];
                    int nse = i;
                    int pse;
                    if (s.isEmpty()) {
                        pse = -1;  
                    } else {
                        pse = s.peek();
                    }
                    int area = h * (nse - pse - 1);
                    max = Math.max(max, area);
                }
                s.push(i);
            }
        }
        while (!s.isEmpty()) {
            int nse = heights.length;
            int h = heights[s.pop()];
            int pse;
            if (s.isEmpty()) {
                pse = -1;
            } else {
                pse = s.peek();
            }
            int area = h * (nse - pse - 1);
            max = Math.max(max, area);
        }
        return max;
    }
}
