class Solution {
    public int possibleStringCount(String word) {
        int count =0;
        int i = 0;
        while(i<word.length()-1){
            if(word.charAt(i) == word.charAt(i+1)){
                count++;
            }
            i++;
        }
        return count+1;
    }
}