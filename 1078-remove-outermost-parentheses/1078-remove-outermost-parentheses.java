class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int ctOpen=0;
        int ctClose = 0;
        for(int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(') ctOpen++;
            if(ch == ')') ctClose++;
            if(ctOpen == ctClose){
                ctOpen =0;
                ctClose =0;
                continue;
            }
            if(ctOpen ==1)continue;
            if(ch == '('){
                sb.append(ch);
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}