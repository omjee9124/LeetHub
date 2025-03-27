class Solution {
    public int mySqrt(int x) {
        int s = 0;
        int e = x;
        int mid;
        int ans = 0;
        while(s<=e){
            mid = s+(e-s)/2;
            long sq = (long)mid*mid;
            if(sq == x){
                return mid;
            }else if(sq > x){
                e = mid-1;
            }else{
                ans = mid;
                s = mid+1;
            }
        }
        return ans;
        
    }
}