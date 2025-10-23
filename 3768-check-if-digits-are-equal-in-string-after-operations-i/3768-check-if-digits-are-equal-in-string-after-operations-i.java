class Solution {
    public boolean hasSameDigits(String s) {
       
    
        // Continue until the string has exactly two digits
        while (s.length() > 2) {
            StringBuilder next = new StringBuilder();
            
            // For each pair of consecutive digits
            for (int i = 0; i < s.length() - 1; i++) {
                int a = s.charAt(i) - '0';
                int b = s.charAt(i + 1) - '0';
                next.append((a + b) % 10);
            }
            
            s = next.toString(); // Replace s with new sequence
        }
        
        // Return true if both final digits are the same
        return s.charAt(0) == s.charAt(1);
    }

    // For local testing
    public static void main(String[] args) {
        
       
    }
}

    
