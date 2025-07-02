class Solution {
    int n;
    int[] heights;
    int[] seg;  // segment tree for range-max

    public int[] leftmostBuildingQueries(int[] heights, int[][] queries) {
        this.n = heights.length;
        this.heights = heights;
        buildSegmentTree();

        int q = queries.length;
        int[] ans = new int[q];

        for (int i = 0; i < q; i++) {
            int a = queries[i][0], b = queries[i][1];
            if (a == b) {
                ans[i] = a;
                continue;
            }

            int m = Math.max(a, b);
            // 1) Can they meet at m itself?
            boolean canA = (a == m) || (a < m && heights[a] < heights[m]);
            boolean canB = (b == m) || (b < m && heights[b] < heights[m]);
            if (canA && canB) {
                ans[i] = m;
                continue;
            }

            // 2) Otherwise, find first index > m with height > max(h[a], h[b])
            int h = Math.max(heights[a], heights[b]);
            int k = findFirstGreater(1, 0, n - 1, m + 1, n - 1, h);
            ans[i] = (k == -1 ? -1 : k);
        }

        return ans;
    }

    // Build segment tree of size 4*n
    private void buildSegmentTree() {
        seg = new int[4 * n];
        build(1, 0, n - 1);
    }

    private void build(int idx, int l, int r) {
        if (l == r) {
            seg[idx] = heights[l];
        } else {
            int mid = (l + r) >>> 1;
            build(idx << 1, l, mid);
            build(idx << 1 | 1, mid + 1, r);
            seg[idx] = Math.max(seg[idx << 1], seg[idx << 1 | 1]);
        }
    }

    // Query: find the first position in [ql..qr] where heights[pos] > h
    // Returns -1 if none.
    private int findFirstGreater(int idx, int l, int r, int ql, int qr, int h) {
        if (ql > r || qr < l || seg[idx] <= h) {
            // out of range or no value > h in this segment
            return -1;
        }
        if (l == r) {
            // leaf and seg[idx] > h
            return l;
        }
        int mid = (l + r) >>> 1;
        // try left child first (to get the leftmost index)
        int leftRes = findFirstGreater(idx << 1,     l,     mid, ql, qr, h);
        if (leftRes != -1) return leftRes;
        // otherwise go right
        return findFirstGreater(idx << 1 | 1, mid + 1, r,   ql, qr, h);
    }
}
