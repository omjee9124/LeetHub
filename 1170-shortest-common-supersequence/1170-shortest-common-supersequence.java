class Solution {
    public String shortestCommonSupersequence(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        int t[][] = new int[m+1][n+1];

        for(int i =0; i<=m; i++){
            for(int j = 0; j<=n; j++){
                if(i==0||j==0){
                    t[i][j]= 0;

                }
            }
        }

        for(int i =1; i<=m; i++){
            for(int j =1; j<=n; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    t[i][j] = 1+t[i-1][j-1];

                }else{
                    t[i][j]= Math.max(t[i][j-1], t[i-1][j]);
                }
            }
        }

        int i =m,j =n;
        StringBuilder sb = new StringBuilder();
        while(i>0 && j>0){
            if(s1.charAt(i-1) == s2.charAt(j-1)){
                sb.append(s1.charAt(i-1));
                i--;
                j--;
            }
            else{
                if(t[i][j-1]>t[i-1][j]){
                    sb.append(s2.charAt(j-1));
                    j--;
                }else{
                    sb.append(s1.charAt(i-1));
                    i--;
                }
            }
        }

        while(i>0){
            sb.append(s1.charAt(--i));
            
        }
        while(j>0){
            sb.append(s2.charAt(--j));
            
        }
        return sb.reverse().toString();
    }
}