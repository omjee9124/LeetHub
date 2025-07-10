class Solution {
    public boolean isSubsequence(String A, String B) {
        int i =0;
        int j =0;
        while(i<A.length() && j < B.length()){
            if(A.charAt(i) == B.charAt(j)){
                i++;
                
            }
            j++;
            
        }
        if(i==A.length()){
            return true;
        }else{
            return false;
        }
    }
}