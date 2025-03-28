class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        int st = 0;
        int e = s.length()-1;
        while(st<=e){
            char curr = s.charAt(st);
            char last = s.charAt(e);
            if(!Character.isLetterOrDigit(curr)){
                st++;
            }
            else if(!Character.isLetterOrDigit(last)){
                e--;
            }else{
                if(Character.toLowerCase(curr) != Character.toLowerCase(last)){
                    return false;
                }
                st++;
                e--;
            }
        }
        return true;
    }
}
