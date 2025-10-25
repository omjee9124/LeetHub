class Solution {
    public int totalMoney(int n) {
        
   
        int weeks = n / 7;         // Number of complete weeks
        int days = n % 7;          // Remaining days after complete weeks
        
        // Total from complete weeks:
        // Each week increases the starting amount by 1
        // Sum of first 'weeks' arithmetic series of weekly deposits
        // Each week: sum = 7 * start + 21 (since 1+2+...+7 = 28)
        // For 0th week start=1 → total += 28
        // For 1st week start=2 → total += 35, etc.
        int total = 7 * (weeks * (weeks - 1) / 2) + 28 * weeks;

        // Remaining days (partial week)
        int start = weeks + 1;
        for (int i = 0; i < days; i++) {
            total += start + i;
        }

        return total;
    }
}

    
