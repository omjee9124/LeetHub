class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;

        int first[] = new int[256];
        int sec[] = new int[256];

        for(int i = 0; i< s.length(); i++){
            char ss = s.charAt(i);
            char tt = t.charAt(i);

            if(first[ss] == 0 && sec[tt] == 0){
                first[ss] = tt;
                sec[tt] = ss;
            }else{
                if(first[ss] != tt || sec[tt] != ss) return false;
            }
        }
        return true;
    }
}