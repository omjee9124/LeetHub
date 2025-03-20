class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        long sum[] = new long[shifts.length];
        sum[sum.length-1] = shifts[shifts.length-1];
        for(int i = sum.length-2; i>=0; i--){
            sum[i] = sum[i+1] + shifts[i]; 
        }
        StringBuilder str = new StringBuilder(s);
        for(int i =0; i< sum.length; i++){
            char ch = (char) ('a' + (s.charAt(i) - 'a' + sum[i]) % 26);
            str.setCharAt(i,ch);
        }
        return str.toString();
    }
}