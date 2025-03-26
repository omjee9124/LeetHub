class Solution {
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