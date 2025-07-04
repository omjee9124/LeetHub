class Solution {
    public char kthCharacter(long k, int[] operations) {
        int n = operations.length;
        long[] lengths = new long[n + 1];
        lengths[0] = 1; // Start with "a"

        // First, build the lengths array
        for (int i = 0; i < n; i++) {
            if (operations[i] == 0) {
                lengths[i + 1] = lengths[i] * 2;
            } else {
                lengths[i + 1] = lengths[i] * 2;
            }

            // Cap the length if it gets too large (avoid overflow)
            if (lengths[i + 1] > k) {
                lengths[i + 1] = k;
            }
        }

        // Start from the end, work backwards
        char ch = 'a';
        for (int i = n - 1; i >= 0; i--) {
            if (k <= lengths[i]) {
                continue; // The character lies in the original half
            } else {
                k = k - lengths[i]; // Shift to the appended half
                if (operations[i] == 1) {
                    ch = (char)((ch - 'a' + 1) % 26 + 'a'); // Update character
                }
                // For operation 0, character stays the same
            }
        }

        return ch;
    }
}
