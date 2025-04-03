class Solution {
    public String longestPalindrome(String s) {
        int max = 0;
        int left =0,right = 0;
        int i = 0;
        //ODD
        while(i<s.length()-1){
            int j = i-1,k=i+1;
            while(j>=0 && k <s.length() && s.charAt(j) == s.charAt(k)){
                if(k-j+1 > max){
                    left = j;
                    right = k;
                    max = k-j+1;
                }
                j--;
                k++;
            }
            i++;
        }

        //EVEN
        i=0;
        while(i<s.length()-1){
            int j = i,k=i+1;
            while(j>=0 && k <s.length() && s.charAt(j) == s.charAt(k)){
                if(k-j+1 > max){
                    left = j;
                    right = k;
                    max = k-j+1;
                }
                j--;
                k++;
            }
            i++;
        }

        return s.substring(left,right+1);
    }
}