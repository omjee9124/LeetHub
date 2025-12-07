class Solution {
    public int countOdds(int low, int high) {
        int count =0;
        int range = high -low;
        count = range/2;
        if(low%2 !=0 || high %2 !=0) count++;
        return count;
    }
}