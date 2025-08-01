class Solution {
    public int longestPalindromeSubseq(String s) {
        StringBuilder s2 = new StringBuilder(s);
        s2.reverse();
        
        int m = s.length();
        int n = s2.length();

        int t[][] = new int[m+1][n+1];

        for(int i =0; i<=m; i++){
            for (int j =0; j<=n; j++ ){
                if(i ==0 || j ==0){
                    t[i][j] = 0;
                }
            }
                   
        }

        for(int i =1; i<=m; i++){
            for(int j = 1; j<=n; j++){
                if(s.charAt(i-1) == s2.charAt(j-1)){
                    t[i][j] = 1+ t[i-1][j-1];
                }else{
                    t[i][j] = Math.max(t[i][j-1], t[i-1][j]);
                }
            }
        }

        return t[m][n];
    }
}