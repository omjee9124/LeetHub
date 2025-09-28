class Solution {
    public String largestOddNumber(String num) {
        StringBuilder sb = new StringBuilder(num);
        for(int i =num.length()-1; i>= 0; i--){
            int n = num.charAt(i) - '0';
            if(n%2 !=0) return sb.toString();
            sb.deleteCharAt(i);
        }
        return sb.toString();
    }
}