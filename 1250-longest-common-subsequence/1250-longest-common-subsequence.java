class Solution {
    static int t[][] = new int[1001][1001];
    public int longestCommonSubsequence(String text1, String text2) {
        for(int i =0; i< 1001; i++){
            for(int j = 0; j< 1001; j++){
                t[i][j] = -1;
            }
        }
        int m = text1.length();
        int n = text2.length();
        return lcs(text1,text2,m,n);
    }
    int lcs(String X, String Y, int m, int n){
        if(m==0 || n ==0){
            return 0;
        }
        if(t[m][n]!=-1){
            return t[m][n];
        }
        if(X.charAt(m-1) == Y.charAt(n-1)){
            return t[m][n] =  1+lcs(X,Y,m-1,n-1);
        }else{
            return t[m][n] =  Math.max(lcs(X,Y,m-1,n), lcs(X,Y,m,n-1));
        }

    }
}