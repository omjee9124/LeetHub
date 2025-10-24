class Solution {
    public int nextBeautifulNumber(int n) {
      
    
        int num = n + 1;
        while (true) {
            if (isBalanced(num)) return num;
            num++;
        }
    }

    private boolean isBalanced(int num) {
        int[] count = new int[10];
        int temp = num;

        // Count occurrences of each digit
        while (temp > 0) {
            count[temp % 10]++;
            temp /= 10;
        }

        // Check if all digits follow the balanced rule
        for (int d = 0; d <= 9; d++) {
            if (count[d] > 0 && count[d] != d) {
                return false;
            }
        }
        return true;
    }
}

    
