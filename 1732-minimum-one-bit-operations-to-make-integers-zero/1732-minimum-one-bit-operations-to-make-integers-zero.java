class Solution {
    public int minimumOneBitOperations(int n) {
        
    
        return helper(n);
    }

    private int helper(int n) {
        if (n == 0) return 0;
        int msb = 31 - Integer.numberOfLeadingZeros(n); // find highest bit
        int mask = 1 << msb;
        return (1 << (msb + 1)) - 1 - helper(n ^ mask);
    }
}

    
