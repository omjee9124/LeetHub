class Solution {
    public int maxScore(String s) {
        int max = 0;
        for(int i = 0 ; i< s.length()-1;i++){
            int count_0 = 0;
            int count_1 = 0;
            for(int j = 0; j <= i ; j++){
                if(s.charAt(j) == '0'){
                    count_0++;
                }
            }
            for(int j =i+1; j< s.length();j++){
                if(s.charAt(j) == '1'){
                    count_1++;
                }
            }
            int sum = count_0+ count_1;
            max = Math.max(max,sum);
        }
        return max;
    }
}