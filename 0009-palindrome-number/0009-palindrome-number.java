class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int a = reverse(x);
        if(a==x){
            return true;
        }else{
            return false;
        }
    }
    public int reverse(int x) {
        long temp = Math.abs(x);
        long a = 0,d = 0;
        while(temp!=0){
            d = temp%10;
            a = (a*10)+d;
            temp=temp/10;
        }
        if(a < Integer.MIN_VALUE || a > Integer.MAX_VALUE){
            return 0;
        }
        if(x>0){
            return (int)a;
        }else{
            return -(int)a;
        }
    }
}