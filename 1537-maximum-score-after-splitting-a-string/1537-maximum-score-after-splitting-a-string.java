class Solution {
    public int maxScore(String s) {
        int max = 0 ;
        int pre= 0;
        int suf = 0;
        for(int i = 0 ; i< s.length();i++){
            if(s.charAt(i) == '0'){
                pre++;
            }
        }
        for(int i = s.length()-1; i>0;i--){
            if(s.charAt(i) == '1'){
                suf++;
                int sum = suf+pre;
                max = Math.max(max,sum);
            }else{
                pre--;
                int sum = suf+pre;
                max = Math.max(max,sum);
            }
        }
        return max;
    }
}